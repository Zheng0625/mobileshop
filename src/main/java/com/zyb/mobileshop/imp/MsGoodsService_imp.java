package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.*;
import com.zyb.mobileshop.entity.*;
import com.zyb.mobileshop.entity.brief.BriefGoods;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsCatService;
import com.zyb.mobileshop.service.MsGoodsService;
import com.zyb.mobileshop.util.Page;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.*;


@Service
public class MsGoodsService_imp implements MsGoodsService {

    @Resource
    private MsGoodsMapper msGoodsMapper;
    @Resource
    private MsGoodsCatMapper msGoodsCatMapper;
    @Resource
    private MsGoodsTypeMapper msGoodsTypeMapper;
    @Resource
    private MsBrandMapper msBrandMapper;
    @Resource
    private MsGoodsStoreMapper msGoodsStoreMapper;
    @Resource
    private MsGoodsImgMapper msGoodsImgMapper;
    @Resource
    private MsGoodsCatService msGoodsCatService;
    @Resource
    private MsCartMapper msCartMapper;
    @Autowired
    private Page page;

    //新增商品
    @Transactional
    @Override
    public Result addGoods(String name, String sn, String brief, String description, double price, double cost, double mktprice, int cat_id, int brand_id, double weight, String intro) {
        Result result = new Result();
        BriefGoods bg = msGoodsMapper.findByName(name);
        if (bg != null) {
            result.setStatus(-1);
            result.setMsg("此商品名称已经存在");
            return result;
        }
        MsGoodsCat gc = msGoodsCatMapper.findById(cat_id);
        if (gc == null) {
            result.setStatus(-1);
            result.setMsg("没有此分类");
            return result;
        }
        if (gc.getListShow() != 0) {
            result.setStatus(-1);
            result.setMsg("此分类不可用");
            return result;
        }
        if (gc.getParentId() != 0) {
            result.setStatus(-1);
            result.setMsg("不能在顶级分类中添加商品");
            return result;
        }
        MsBrand msBrand = msBrandMapper.selectByPrimaryKey(brand_id);

        if (msBrand == null) {
            result.setStatus(-1);
            result.setMsg("没有此品牌");
            return result;
        }
        if (msBrand.getDisabled() != 0) {
            result.setStatus(1);
            result.setMsg("此品牌不可用");
            return result;
        }
        MsGoodsWithBLOBs msGoods = new MsGoodsWithBLOBs();
        msGoods.setName(name);//名称
        msGoods.setSn(sn);//货号
        msGoods.setBrief(brief);//简介
        msGoods.setDescription(description);//详细描述
        msGoods.setPrice(price);//销售价
        msGoods.setCost(cost);//成本价
        msGoods.setMktprice(mktprice);//市场价
        msGoods.setMktEnable((byte) 0);//默认上架
        msGoods.setCatId(cat_id);//分类id
        msGoods.setBrandId(brand_id);//品牌id
        msGoods.setWeight(weight);//重量
        msGoods.setIntro(intro);//详情图片
        int typeId = gc.getTypeId();
        MsGoodsType gt = msGoodsTypeMapper.selectByPrimaryKey(typeId);
        if (gt != null) {
            msGoods.setParams(gt.getParams());//参数
        } else {
            msGoods.setParams("");//参数
        }
        msGoods.setCreatime(null);//创建时间
        msGoods.setLastModify(null);//最后修改时间
        msGoods.setViewCount(0);//浏览次数
        msGoods.setBuyCount(0);//购买次数
        //默认没有主图相关图片
        msGoods.setThumbnail("");//缩略图
        msGoods.setBig("");//大图
        msGoods.setSmall("");//小图
        msGoods.setOrinal("");//原图
        msGoodsMapper.insert(msGoods);
        //更新分类中的商品数量（+1）
        msGoodsCatService.updateGoodsCount(cat_id, 0);
        result.setStatus(0);
        result.setMsg("新建商品成功");
        result.setData(msGoods);
        return result;
    }

    @Override
    public Result loadAllGoodsByPage(int current) {
        Result result = new Result();
        page.setCurrent(current);
        List<BriefGoods> briefGoodsList = msGoodsMapper.findUnionByPage(page);
        if (briefGoodsList.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("此页没有商品");
            result.setData(briefGoodsList);
            return result;
        }
        result.setStatus(0);
        result.setMsg("商品查询成功");
        result.setData(briefGoodsList);
        return result;
    }

    @Override
    //根据id加载商品（关联查询）
    public Result loadGoodsById(int goodsId) {
        Result result = new Result();
        MsGoods checkGoods = msGoodsMapper.selectByPrimaryKey(goodsId);
        if (checkGoods == null) {
            result.setStatus(-1);
            result.setMsg("不存在此商品");
            return result;
        }
        //更新浏览次数
        int viewCount = checkGoods.getViewCount();
        viewCount++;
        MsGoodsWithBLOBs updateGoods = new MsGoodsWithBLOBs();
        updateGoods.setGoodsId(checkGoods.getGoodsId());
        updateGoods.setViewCount(viewCount);
        msGoodsMapper.updateByPrimaryKeySelective(updateGoods);
        //关联查询
        MsGoods msGoods = msGoodsMapper.findUnionById(goodsId);
        result.setStatus(0);
        result.setMsg("加载商品信息成功");
        result.setData(msGoods);
        return result;
    }

    @Override
    //根据分类名称或品牌名称或商品关键字查询
    public Result searchGoods(String input) {
        Result result = new Result();
        //判断input是否为空
        if ("".equals(input)) {
            result.setStatus(-1);
            result.setMsg("请输入您搜索的关键字");
            return result;
        }
        List<BriefGoods> allBGS = new ArrayList<>();
        //根据商品关键字查询
        //trim()删除两端的空格
        String likeName = "%" + input.trim() + "%";
        Map<String, Object> map = new HashMap<>();
        map.put("name", likeName);
        map.put("mktEnable", 0);
        List<BriefGoods> briefGoodsList = msGoodsMapper.dynamicFind(map);
        allBGS.addAll(briefGoodsList);
        if (!briefGoodsList.isEmpty()) {
            result.setStatus(0);
            result.setMsg("根据商品关键字查询商品成功");
            result.setData(allBGS);
            return result;
        }
        //根据品牌名称查询
        MsBrand msBrand = msBrandMapper.findByName(input);
        if (msBrand != null) {
            int brandId = msBrand.getBrandId();
            Map<String, Object> map1 = new HashMap<>();
            map1.put("brandId", brandId);
            map1.put("mktEnable", 0);
            List<BriefGoods> list = msGoodsMapper.dynamicFind(map1);
            allBGS.addAll(list);
            if (!list.isEmpty()) {
                result.setStatus(0);
                result.setMsg("根据品牌查询商品成功");
                result.setData(allBGS);
                return result;
            }
        }
        //根据分类名称查询
        MsGoodsCat msGoodsCat = msGoodsCatMapper.findByName(input);
        if (msGoodsCat != null) {
            //顶级分类
            if (msGoodsCat.getParentId() == 0) {
                MsGoodsCat gc1 = new MsGoodsCat();
                gc1.setParentId(msGoodsCat.getCatId());
                gc1.setListShow((byte) 0);
                List<MsGoodsCat> msGoodsCatList = msGoodsCatMapper.dynamicFind(gc1);
                //顶级分类下没有二级分类
                if (msGoodsCatList.isEmpty()) {
                    result.setStatus(-1);
                    result.setMsg("此分类下没有商品");
                    return result;
                }
                for (MsGoodsCat mgc : msGoodsCatList) {
                    int subCatId = mgc.getCatId();
                    Map<String, Object> map2 = new HashMap<>();
                    map2.put("catId", subCatId);
                    map2.put("mktEnable", 0);
                    List<BriefGoods> bgs2 = msGoodsMapper.dynamicFind(map2);
                    allBGS.addAll(bgs2);
                }
                if (!allBGS.isEmpty()) {
                    result.setStatus(0);
                    result.setMsg("根据分类查询商品成功");
                    result.setData(allBGS);
                    return result;
                }
            } else {
                //二级分类
                Map<String, Object> map3 = new HashMap<>();
                map3.put("catId", msGoodsCat.getCatId());
                map3.put("mktEnable", 0);
                List<BriefGoods> bgs3 = msGoodsMapper.dynamicFind(map3);
                allBGS.addAll(bgs3);
                if (!bgs3.isEmpty()) {
                    result.setStatus(0);
                    result.setMsg("根据分类查询商品成功");
                    result.setData(allBGS);
                    return result;
                }
            }
        }
        result.setStatus(-1);
        result.setMsg("没有符合条件的商品");
        return result;
    }

    @Transactional
    @Override
    //根据id更新params
    public Result updateParams(int goodsId, String[] paramsValue) {
        Result result = new Result();
        MsGoods checkGoods = msGoodsMapper.selectByPrimaryKey(goodsId);
        if (checkGoods == null) {
            result.setStatus(-1);
            result.setMsg("不存在此商品");
            return result;
        }
        MsGoodsCat goodsCat = msGoodsCatMapper.findById(checkGoods.getCatId());
        MsGoodsType goodsType = msGoodsTypeMapper.selectByPrimaryKey(goodsCat.getTypeId());
        //将参数转json
        JSONObject jParams1 = JSONObject.fromObject(goodsType.getParams());
        //将json转map
        Map inMap = jParams1;
        //获取Map的key
        Set<String> keySet = inMap.keySet();
        Iterator iterator = keySet.iterator();
        //将参数值循环加入inMap中
        for (int i =0 ;i<=4;i++) {
            if (iterator.hasNext()) {
                inMap.put(iterator.next(), paramsValue[i]);
            }
        }
        MsGoodsWithBLOBs msGoods = new MsGoodsWithBLOBs();
        msGoods.setGoodsId(goodsId);
        msGoods.setParams(((JSONObject) inMap).toString());
        msGoodsMapper.updateByPrimaryKeySelective(msGoods);
        result.setStatus(0);
        result.setMsg("更新商品参数成功");
        return result;
    }
}

package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsGoodsCatMapper;
import com.zyb.mobileshop.dao.MsGoodsMapper;
import com.zyb.mobileshop.entity.MsGoodsCat;
import com.zyb.mobileshop.entity.brief.BriefGoods;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsCatService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MsGoodsCatService_imp implements MsGoodsCatService {

    @Resource
    private MsGoodsCatMapper msGoodsCatMapper;

    @Resource
    private MsGoodsMapper msGoodsMapper;

    @Transactional
    @Override
    //新增分类
    public Result addCat(String name, int parentId, int typeId) {
        Result result = new Result();
        //判断是否存在此分类
        MsGoodsCat msGoodsCat1 = msGoodsCatMapper.findByName(name);
        if (msGoodsCat1 != null) {
            result.setStatus(-1);
            result.setMsg("已存在此分类");
            return result;
        }
        if (parentId != 0) {
            MsGoodsCat msGoodsCat2 = msGoodsCatMapper.selectByPrimaryKey(parentId);
            //判断父分类是否存在
            if (msGoodsCat2 == null) {
                result.setStatus(-1);
                result.setMsg("父分类不存在");
                return result;
            }
            //判断父分类是否可用
            if (msGoodsCat2.getListShow() != 0) {
                result.setStatus(-1);
                result.setMsg("父分类不可用");
                return result;
            }
        }
        //没有父id，parentId = 0
        //cat_path 问题  格式：0，1，2
        //注意：cat_path是为了方便查看，不是必须字段
        String catPath;
        if (parentId == 0) {
            //没有父id，cat_Path 的格式为 0，n
            //找到n的值
            List<MsGoodsCat> list = msGoodsCatMapper.findByCatPathDESC(3);
            //降序排序，取第一个元素的cat_Path
            String path1 = list.get(0).getCatPath();
            //以逗号将path1拆分为字符串数组
            String[] pathes1 = path1.split(",");
            //取数组中最后一个值
            int pathLength1 = Integer.parseInt(pathes1[1]);
            pathLength1++;
            catPath = "0," + pathLength1;
        } else {
            MsGoodsCat checkGC = msGoodsCatMapper.selectByPrimaryKey(parentId);
            if (checkGC.getParentId() != 0) {
                result.setStatus(-1);
                result.setMsg("此分类不是顶级分类，不能在其下添加分类");
                return result;
            }
            List<MsGoodsCat> list2 = msGoodsCatMapper.findByParentIdDESC(parentId);
            if (list2.isEmpty()) {
                catPath = checkGC.getCatPath() + ",1";
            } else {
                String[] pathes2 = list2.get(0).getCatPath().split(",");
                int pathLength2 = Integer.parseInt(pathes2[2]);
                pathLength2++;
                catPath = checkGC.getCatPath() + "," + pathLength2;
            }
        }
        MsGoodsCat msGoodsCat = new MsGoodsCat();
        msGoodsCat.setName(name);
        msGoodsCat.setParentId(parentId);
        msGoodsCat.setCatPath(catPath);
        msGoodsCat.setGoodsCount(0);
        msGoodsCat.setSort(0);//默认没有排序
        msGoodsCat.setTypeId(typeId);
        msGoodsCat.setListShow((byte) 0);//默认可以显示
        msGoodsCat.setImage("");
        msGoodsCat.setCreatime(null);
        msGoodsCat.setModifytime(null);
        msGoodsCatMapper.insert(msGoodsCat);
        result.setStatus(0);
        result.setMsg("新增分类成功");
        result.setData(msGoodsCat);
        return result;
    }

    @Override
    //加载“可显示到列表”的顶级分类
    public Result loadShowTopCat() {
        Result result = new Result();
        MsGoodsCat msGoodsCat = new MsGoodsCat();
        msGoodsCat.setParentId(0);
        msGoodsCat.setListShow((byte) 0);
        List<MsGoodsCat> goodsCatList = msGoodsCatMapper.dynamicFind(msGoodsCat);
        if (goodsCatList.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("没有顶级分类");
            result.setData(msGoodsCat);
            return result;
        }
        result.setStatus(0);
        result.setMsg("加载可显示的顶级分类成功");
        result.setData(goodsCatList);
        return result;
    }

    //根据id删除
    @Transactional
    @Override
    public Result deleteCatById(int catId) {
        Result result = new Result();
        //获取父id
        int parentId = msGoodsCatMapper.findById(catId).getParentId();
        //如果父id为0，说明是顶级分类
        if (parentId == 0) {
            //判断此顶级分类下是否有子类
            List<MsGoodsCat> list = msGoodsCatMapper.findByParentIdDESC(catId);
            if (!list.isEmpty()) {
                result.setStatus(-1);
                result.setMsg("此分类下有子类，不能删除");
                return result;
            }
        }
        //判断分类下是否有商品
        Map<String, Object> map = new HashMap<>();
        map.put("catId", catId);
        List<BriefGoods> briefGoodsList = msGoodsMapper.dynamicFind(map);
        if (!briefGoodsList.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("此分类下有商品，不能删除");
            return result;
        }
        msGoodsCatMapper.deleteByPrimaryKey(catId);
        result.setStatus(0);
        result.setMsg("删除分类成功");
        return result;
    }

    @Transactional
    @Override
    //根据id更新商品数量
    public Result updateGoodsCount(int catId, int flag) {
        Result result = new Result();
        MsGoodsCat msGoodsCat = msGoodsCatMapper.findById(catId);
        if (msGoodsCat == null) {
            result.setStatus(-1);
            result.setMsg("不存在此分类");
            return result;
        }
        //更新GoodsCount
        int goodsCount = msGoodsCat.getGoodsCount();
        if (flag == 0) {
            goodsCount++;
        } else {
            if (goodsCount > 0) {
                goodsCount--;
            }
        }
        MsGoodsCat goodsCat = new MsGoodsCat();
        goodsCat.setCatId(catId);
        goodsCat.setGoodsCount(goodsCount);
        msGoodsCatMapper.updateByPrimaryKeySelective(goodsCat);
        //更新父分类中的GoodsCount
        int parentId = msGoodsCat.getParentId();
        if (parentId != 0) {
            MsGoodsCat parentGC = msGoodsCatMapper.findById(parentId);
            int parentGoodsCount = parentGC.getGoodsCount();
            if (flag == 0) {
                parentGoodsCount++;
            } else {
                if (parentGoodsCount > 0) {
                    parentGoodsCount--;
                }
            }
            MsGoodsCat parentGoodsCat = new MsGoodsCat();
            parentGoodsCat.setGoodsCount(parentGoodsCount);
            parentGoodsCat.setCatId(parentId);
            msGoodsCatMapper.updateByPrimaryKeySelective(parentGoodsCat);
        }
        result.setStatus(0);
        result.setMsg("更新商品数量成功");
        return result;
    }
}

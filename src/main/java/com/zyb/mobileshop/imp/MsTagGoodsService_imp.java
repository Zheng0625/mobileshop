package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsGoodsMapper;
import com.zyb.mobileshop.dao.MsTagGoodsRefMapper;
import com.zyb.mobileshop.dao.MsTagMapper;
import com.zyb.mobileshop.entity.MsGoods;
import com.zyb.mobileshop.entity.MsTag;
import com.zyb.mobileshop.entity.MsTagGoodsRef;
import com.zyb.mobileshop.entity.MsTagGoodsRefExample;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsTagGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MsTagGoodsService_imp implements MsTagGoodsService {

    @Resource
    private MsTagGoodsRefMapper msTagGoodsRefMapper;
    @Resource
    private MsTagMapper msTagMapper;
    @Resource
    private MsGoodsMapper msGoodsMapper;

    @Transactional
    @Override
    //新增标签商品关联信息
    public Result add(int tagId, int goodsId) {
        Result result = new Result();
        MsTag tag = msTagMapper.selectByPrimaryKey(tagId);
        //判断标签是否存在
        if (tag == null) {
            result.setStatus(-1);
            result.setMsg("此标签不存在");
            return result;
        }
        //判断是否为商品标签
        if (tag.getType() != 0) {
            result.setStatus(-1);
            result.setMsg("此标签不是商品标签");
            return result;
        }
        List<MsTagGoodsRef> tgs = msTagGoodsRefMapper.findUnionByTagId(tagId);
        //判断标签下的商品数量
        if (tgs.size() > tag.getCount()) {
            result.setStatus(-1);
            result.setMsg("该标签下商品数量已满");
            return result;
        }
        MsGoods msGoods = msGoodsMapper.selectByPrimaryKey(goodsId);
        //判断商品是否存在
        if (msGoods == null) {
            result.setStatus(-1);
            result.setMsg("不存在此商品");
            return result;
        }
        //判断商品是否上架
        if (msGoods.getMktEnable() != 0) {
            result.setStatus(-1);
            result.setMsg("此商品未上架");
            return result;
        }
        //判断是否已经关联
        Map<String, Object> map = new HashMap<>();
        map.put("tag_id", tagId);
        map.put("goods_id", goodsId);
        MsTagGoodsRef checkTG = msTagGoodsRefMapper.findRepeat(map);
        if (checkTG != null) {
            result.setStatus(-1);
            result.setMsg("此标签已经关联过此商品");
            return result;
        }
        MsTagGoodsRef tagGoodsRef = new MsTagGoodsRef();
        tagGoodsRef.setTagId(tagId);
        tagGoodsRef.setGoodsId(goodsId);
        tagGoodsRef.setSort((short) 0);//默认无排序
        tagGoodsRef.setCreatime(null);
        tagGoodsRef.setModifytime(null);
        msTagGoodsRefMapper.insert(tagGoodsRef);
        result.setStatus(0);
        result.setMsg("添加标签商品关联信息成功");
        result.setData(tagGoodsRef);
        return result;
    }

    @Override
    //根据id更新排序（sort）
    public Result updateSortById(int id, int sort) {
        Result result = new Result();
        MsTagGoodsRef checkTG = msTagGoodsRefMapper.selectByPrimaryKey(id);
        if (checkTG == null) {
            result.setStatus(-1);
            result.setMsg("此标签商品关联信息不存在");
            return result;
        }
        MsTagGoodsRef tagGoodsRef = new MsTagGoodsRef();
        tagGoodsRef.setId(id);
        tagGoodsRef.setSort((short) sort);
        Timestamp now = new Timestamp(System.currentTimeMillis());
        tagGoodsRef.setModifytime(now);
        msTagGoodsRefMapper.updateByPrimaryKeySelective(tagGoodsRef);
        result.setStatus(0);
        result.setMsg("更新排序成功");
        result.setData(tagGoodsRef);
        return result;
    }

}

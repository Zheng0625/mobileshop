package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsGoodsLikeMapper;
import com.zyb.mobileshop.dao.MsGoodsMapper;
import com.zyb.mobileshop.dao.MsMemberMapper;
import com.zyb.mobileshop.entity.MsGoods;
import com.zyb.mobileshop.entity.MsGoodsLike;
import com.zyb.mobileshop.entity.MsMember;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsLikeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class MsGoodsLikeService_imp implements MsGoodsLikeService {

    @Resource
    private MsGoodsLikeMapper msGoodsLikeMapper;
    @Resource
    private MsGoodsMapper msGoodsMapper;
    @Resource
    private MsMemberMapper msMemberMapper;

    @Override
    //新增商品收藏信息
    public Result add(int goodsId, int memberId) {
        Result result = new Result();
        MsGoods goods = msGoodsMapper.selectByPrimaryKey(goodsId);
        if (goods == null) {
            result.setStatus(-1);
            result.setMsg("不存在此商品");
            return result;
        }
        if (goods.getMktEnable() != 0) {
            result.setStatus(-1);
            result.setMsg("商品已下架");
            return result;
        }
        MsMember msMember = msMemberMapper.findById(memberId);
        if (msMember == null) {
            result.setStatus(-1);
            result.setMsg("不存在此会员");
            return result;
        }
        Map<String, Object> map = new HashMap<>();
        map.put("goodsId", goodsId);
        map.put("memberId", memberId);
        MsGoodsLike checkGL = msGoodsLikeMapper.findRepeat(map);
        if (checkGL != null) {
            result.setStatus(-1);
            result.setMsg("此会员已收藏过该商品");
            return result;
        }
        MsGoodsLike msGoodsLike = new MsGoodsLike();
        msGoodsLike.setGoodsId(goodsId);
        msGoodsLike.setMemberId(memberId);
        msGoodsLike.setCreatime(null);
        msGoodsLike.setModifytime(null);
        msGoodsLikeMapper.insert(msGoodsLike);
        result.setStatus(0);
        result.setMsg("收藏商品成功");
        result.setData(msGoodsLike);
        return result;
    }
}

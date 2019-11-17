package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsGoodsLikeService {

    //新增商品收藏信息
    public Result add(int goodsId, int memberId);
}

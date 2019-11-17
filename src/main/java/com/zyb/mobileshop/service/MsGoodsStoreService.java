package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsGoodsStoreService {

    //新增商品库存
    public Result addStore(int goodsId, int store);

    //根据id更新库存
    public Result updateStore(int storeId, int store);
}

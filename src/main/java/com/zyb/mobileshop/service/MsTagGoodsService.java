package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsTagGoodsService {

    //新增标签商品关联信息
    public Result add(int tagId, int goodsId);

    //根据id更新排序
    public Result updateSortById(int id, int sort);
}

package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsTagService {
    //新增标签
    public Result addTag(String name, int type, int count, int team);

    //加载所有标签（分页）
    public Result loadAllTagsByPage(int current);

    //根据分组加载标签下的商品
    public Result loadAllGoodsByTeam(int team);
}

package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsGoodsTypeService {
    //新增类型
    public Result addType(String name, String[] paramsKey, int isPhysical);

    //根据id更新disabled
    public Result updateDisabled(int typeId, int disabled);

    //加载所有可用的商品类型
    public Result loadTypeByDisabled();
}

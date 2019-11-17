package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsTypeBrandService {
    //新增类型品牌关联信息
    public Result add(int typeId, int brandId);

    //加载所有(关联查询)
    public Result loadAll();

    //根据ID更新
    public Result update(int id,int typeId,int brandId);
}

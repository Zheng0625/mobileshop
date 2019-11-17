package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsGoodsService {
    //新增商品
    public Result addGoods(String name, String sn, String brief, String description, double price, double cost, double mktprice, int cat_id, int brand_id, double weight, String intro);

    //加载所有商品（关联查询+分页）
    public Result loadAllGoodsByPage(int current);

    //根据id加载商品（关联查询）
    public Result loadGoodsById(int goodsId);

    //根据分类名称或品牌名称或商品关键字查询
    public Result searchGoods(String input);

    //根据id更新params
    public Result updateParams(int goodsId, String[] paramsValue);
}

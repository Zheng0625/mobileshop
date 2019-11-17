package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsGoodsCatService {
    //新增分类
    public Result addCat(String name, int parentId, int typeId);

    //加载“可显示到列表”的顶级分类
    public Result loadShowTopCat();

    //根据id删除
    public Result deleteCatById(int catId);

    //根据id更新商品数量 flag=0，数量+1，flag=1，数量-1
    public Result updateGoodsCount(int catId,int flag);
}

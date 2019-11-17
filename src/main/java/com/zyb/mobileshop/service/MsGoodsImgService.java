package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsGoodsImgService {

    //新增商品图片引用
    public Result addImg(int goodsId, int isdefault, String img, String url);

    //根据id更新
    public Result updateImg(int imgId, String img, String url);

    //根据id删除
    public Result deleteImgById(int imgId, String url);
}

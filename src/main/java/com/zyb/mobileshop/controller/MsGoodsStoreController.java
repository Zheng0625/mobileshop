package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.MsGoodsStore;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsStoreService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/store")
public class MsGoodsStoreController {
    @Resource
    private MsGoodsStoreService msGoodsStoreService;

    //新增商品库存
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result add(int goodsId, int store) {
        Result result = msGoodsStoreService.addStore(goodsId, store);
        return result;
    }

    //根据id更新库存
    @RequestMapping(value = "/{storeId}", method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result update(@PathVariable("storeId") int storeId, int store) {
        Result result = msGoodsStoreService.updateStore(storeId, store);
        return result;
    }
}

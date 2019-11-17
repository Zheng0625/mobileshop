package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsLikeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/like")
public class MsGoodsLikeController {

    @Resource
    private MsGoodsLikeService msGoodsLikeService;

    //新增商品收藏成功
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result add(int goodsId, int memberId) {
        Result result = msGoodsLikeService.add(goodsId, memberId);
        return result;
    }
}

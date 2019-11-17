package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsTagGoodsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MsTagGoodsController {

    @Resource
    public MsTagGoodsService msTagGoodsService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    //新增标签商品关联信息
    public Result add(int tagId, int goodsId) {
        Result result = msTagGoodsService.add(tagId, goodsId);
        return result;
    }

    @RequestMapping(value = "/sort/{id}",method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    //根据id更新排序（sort）
    public Result updateSortById(@PathVariable("id") int id, int sort) {
        Result result = msTagGoodsService.updateSortById(id, sort);
        return result;
    }
}

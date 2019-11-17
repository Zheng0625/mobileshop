package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsCatService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/cat")
public class MsGoodsCatController {

    @Resource
    private MsGoodsCatService msGoodsCatService;

    //新增分类
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    private Result add(String name, int parentId, int typeId) {
        Result result = msGoodsCatService.addCat(name, parentId, typeId);
        return result;
    }

    //加载“可显示到列表”的顶级分类
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result loadShowTopCat() {
        Result result = msGoodsCatService.loadShowTopCat();
        return result;
    }

    //根据id删除
    @RequestMapping(value = "/{catId}", method = RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result deleteCatById(@PathVariable("catId") int catId) {
        Result result = msGoodsCatService.deleteCatById(catId);
        return result;
    }
}

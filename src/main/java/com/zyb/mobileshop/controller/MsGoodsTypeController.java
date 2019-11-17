package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsTypeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/goodstype")
public class MsGoodsTypeController {

    @Resource
    private MsGoodsTypeService msGoodsTypeService;

    //新增类型
    @RequestMapping("/add")
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result addType(String name, String param1, String param2, String param3, String param4, String param5,int isPhysical){
        String[] paramsKey = new String[]{param1, param2, param3, param4, param5};
        Result result = msGoodsTypeService.addType(name, paramsKey, isPhysical);
        return result;
    }
    //根据id更新disabled
    @RequestMapping("/disabled/{typeId}")
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result updateDisabled (@PathVariable("typeId") int typeId, int disabled) {
        Result result = msGoodsTypeService.updateDisabled(typeId, disabled);
        return result;
    }
    //加载所有可用的商品类型
    @RequestMapping(value = "/disabled", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result loadTypeByDisabled() {
        Result result = msGoodsTypeService.loadTypeByDisabled();
        return result;
    }


}

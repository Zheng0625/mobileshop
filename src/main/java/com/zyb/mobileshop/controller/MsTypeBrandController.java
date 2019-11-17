package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsTypeBrandService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.time.Year;

@Controller
@RequestMapping("/type_brand")
public class MsTypeBrandController {

    @Resource
    private MsTypeBrandService msTypeBrandService;

    //新增类型品牌关联信息
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result add(int typeId, int brandId) {
        Result result = msTypeBrandService.add(typeId, brandId);
        return result;
    }
    //加载所有（关联查询）
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result loadAll() {
        Result result = msTypeBrandService.loadAll();
        return result;
    }

    //根据id更新
    @RequestMapping(value = "/{id}",method= RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result update(@PathVariable("id") int id, int typeId, int brandId) {
        Result result = msTypeBrandService.update(id, typeId, brandId);
        return result;
    }
}

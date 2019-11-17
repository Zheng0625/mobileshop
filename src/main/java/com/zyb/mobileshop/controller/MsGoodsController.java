package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/goods")
public class MsGoodsController {
    @Resource
    private MsGoodsService msGoodsService;

    //新增商品
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result addGoods(String name, String sn, String brief, String description, double price, double cost, double mktprice, int cat_id, int brand_id, double weight, String intro) {
        Result result = msGoodsService.addGoods(name, sn, brief, description, price, cost, mktprice, cat_id, brand_id, weight, intro);
        return result;
    }
    //加载所有商品（关联查询+分页）
    @RequestMapping(value = "/page/{pageId}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result loadAllGoodsByPage(@PathVariable("pageId") int pageId) {
        if (pageId == 0) {
            Result result1 = new Result();
            result1.setStatus(-1);
            result1.setMsg("请输入正确页数");
            return result1;
        } else {
            Result result = msGoodsService.loadAllGoodsByPage(pageId);
            return result;
        }
    }
    //根据id加载商品（关联查询）
    @RequestMapping(value = "/union/{goodsId}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result findUnionById(@PathVariable("goodsId") int goodsId) {
        Result result = msGoodsService.loadGoodsById(goodsId);
        return result;
    }

    //根据分类名称或品牌名称或商品关键字查询
    @RequestMapping(value = "/find", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result search(String input) {
        Result result = msGoodsService.searchGoods(input);
        return result;
    }

    //根据id更新params
    @RequestMapping(value = "/params/{goodsId}", method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result updateParams(@PathVariable("goodsId") int goodsId, String param1,String param2,String param3,String param4,String param5) {
        String[] paramsValue = new String[]{param1, param2, param3, param4, param5};
        Result result = msGoodsService.updateParams(goodsId, paramsValue);
        return result;
    }
}

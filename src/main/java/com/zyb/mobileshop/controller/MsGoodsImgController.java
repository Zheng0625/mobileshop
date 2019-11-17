package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsImgService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/img")
public class MsGoodsImgController {
    @Resource
    private MsGoodsImgService msGoodsImgService;

    //新增商品图片引用
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result add(int goodsId, int isdefault, String img, HttpServletRequest request) {
        String url = "http://" + request.getServerName() + ":" + request.getLocalPort();
        Result result = msGoodsImgService.addImg(goodsId, isdefault, img, url);
        return result;
    }

    //根据id更新
    @RequestMapping(value="/{imgId}",method=RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result updateById(@PathVariable("imgId") int imgId, String img,
                             HttpServletRequest request){
        String url="http://"+request.getServerName()+":"+request.getLocalPort();
        Result result=msGoodsImgService.updateImg(imgId, img, url);
        return result;
    }
    //根据id删除
    @RequestMapping(value="/{imgId}",method=RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result deleteById(@PathVariable("imgId") int imgId,HttpServletRequest request){
        String url="http://"+request.getServerName()+":"+request.getLocalPort();
        Result result=msGoodsImgService.deleteImgById(imgId, url);
        return result;
    }
}

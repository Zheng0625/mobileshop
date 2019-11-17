package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsTagService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/tag")
public class MsTagController {
    @Resource
    private MsTagService msTagService;

    //新增标签
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result add(String name, int type, int count, int team) {
        Result result = msTagService.addTag(name, type, count, team);
        return result;
    }

    //加载所有标签（分页）
    @RequestMapping(value = "/page/{pageId}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result loadAllTagsByPage(@PathVariable("pageId") int pageId) {
        Result result = new Result();
        if (pageId == 0) {
            result.setStatus(-1);
            result.setMsg("请输入正确的页数");
            return result;
        }
        result = msTagService.loadAllTagsByPage(pageId);
        return result;
    }
    //根据分组加载标签下的商品
    @RequestMapping(value = "/goods/{teamId}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result loadAllGoodsByTeam(@PathVariable("teamId") int teamId) {
        Result result = msTagService.loadAllGoodsByTeam(teamId);
        return result;
    }
}

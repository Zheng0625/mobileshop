package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MemberService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberService memberService;

    //会员注册
    @RequestMapping("/mem_add")
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result memberAdd(String uname, String password, String email) {
        Result result = memberService.registMember(uname, password, email);
        return result;
    }

    //会员登录
    @RequestMapping("/mem_login")
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result mem_login(String uname, String password) {
        Result result = memberService.checkLogin(uname, password);
        return result;
    }

    //会员信息修改
    @RequestMapping("/mem_update")
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result memUpdate(Integer memberId, String uname, String email, String mobile, Short sex) {
        Result result = memberService.updateMember(memberId, uname, email, mobile, sex);
        return result;
    }

    //会员密码邮箱重置
    @RequestMapping("/mem_updatepwd")
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result memUpdatePwd(String email) {
        Result result = memberService.resetPwd(email);
        return result;
    }

    //会员 用户名/邮箱/手机号 登录
    @RequestMapping("login")
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    public Result memLogin(String input, String password) {
        Result result = memberService.checkLogin2(input, password);
        return result;
    }

}

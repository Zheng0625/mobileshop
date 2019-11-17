package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MemberService {
    //会员注册接口
    public Result registMember(String username, String password, String email);

    //会员登录接口
    public Result checkLogin(String username, String password);

    //会员信息更改
    public Result updateMember(int memberId, String uname, String email, String mobile, Short sex);

    //会员密码邮箱重置
    public Result resetPwd(String email);

    //会员 用户名/邮箱/手机号 登录
    public Result checkLogin2(String input, String password);
}

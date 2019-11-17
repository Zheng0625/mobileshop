package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsMemberMapper;
import com.zyb.mobileshop.entity.MsMember;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MemberService;
import com.zyb.mobileshop.util.MSUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


@Service
@Transactional
public class MemberService_imp implements MemberService {

    @Resource
    private MsMemberMapper msMemberMapper;
    @Transactional
    @Override
    public Result registMember(String username, String password, String email) {
        Result result = new Result();
        //判断uname是否存在
        MsMember checkMember1 = msMemberMapper.findByName(username);
        if (checkMember1 != null) {
            result.setStatus(-1);
            result.setMsg("此用户名已存在");
            return result;
        }
        //判断email是否存在
        MsMember checkMember2 = msMemberMapper.findByEmail(email);
        if (checkMember2 != null) {
            result.setStatus(-1);
            result.setMsg("此邮箱已存在");
            return result;
        }
        //装载参数
        MsMember msMember = new MsMember();
//        msMember.getMemberId(null);
        msMember.setUname(username);
        //密码加密
        String md5_pwd = MSUtil.md5(password);
        msMember.setPassword(md5_pwd);
        msMember.setEmail(email);
        msMember.setSex((short) 0);//默认为男
        msMember.setMobile("");
        msMember.setRegtime(null);
        msMember.setLastlogin(null);
        msMember.setImage("");
        msMemberMapper.insert(msMember);
        result.setStatus(0);
        result.setMsg("注册成功");
        result.setData(msMember);
        return result;
    }

    @Override
    public Result checkLogin(String username, String password) {
        Result result = new Result();
        MsMember msMember = msMemberMapper.findByName(username);
        //判断用户是否存在
        if (msMember == null) {
            result.setStatus(-1);
            result.setMsg("此用户不存在");
            return result;
        }
        //判断密码是否正确
        String md5_pwd = MSUtil.md5(password);
        if (!md5_pwd.equals(msMember.getPassword())) {
            result.setStatus(-1);
            result.setMsg("密码错误");
            return result;
        }
        //更新最后登录时间
        int memberId = msMember.getMemberId();
        MsMember updateMember = new MsMember();
        updateMember.setMemberId(memberId);
        //获取系统当前时间
        Timestamp now = new Timestamp(System.currentTimeMillis());
        updateMember.setLastlogin(now);
        msMemberMapper.updateByPrimaryKeySelective(updateMember);
        msMember.setLastlogin(msMemberMapper.findById(memberId).getLastlogin());
        result.setStatus(0);
        result.setMsg("用户登录成功");
        result.setData(msMember);
        return result;
    }

    @Transactional
    @Override
    public Result updateMember(int memberId, String uname, String email, String mobile, Short sex) {
        Result result = new Result();
        //判断是否存在此会员
        MsMember checkMember1 = msMemberMapper.findById(memberId);
        if (checkMember1 == null) {
            result.setStatus(-1);
            result.setMsg("此用户不存在");
            return result;
        }
        //判断uname是否存在
        if (!"".equals(uname)) {
            Map<String, Object> map = new HashMap<>();
            map.put("uname", uname);
            MsMember checkMember2 = msMemberMapper.dynamicFind(map);
            if (checkMember2 != null && !uname.equals(checkMember1.getUname())) {
                result.setStatus(-1);
                result.setMsg("此用户名已存在");
                return result;
            }
        }
        //判断email是否存在
        if (!"".equals(email)) {
            Map<String, Object> map = new HashMap<>();
            map.put("email", email);
            MsMember checkMember2 = msMemberMapper.dynamicFind(map);
            if (checkMember2 != null && !email.equals(checkMember1.getEmail())) {
                result.setStatus(-1);
                result.setMsg("此邮箱已存在");
                return result;
            }
        }
        //判断mobile是否存在
        if (!"".equals(mobile)) {
            Map<String, Object> map = new HashMap<>();
            map.put("mobile", mobile);
            MsMember checkMember2 = msMemberMapper.dynamicFind(map);
            if (checkMember2 != null && !mobile.equals(checkMember1.getMobile())) {
                result.setStatus(-1);
                result.setMsg("此手机号已存在");
                return result;
            }
        }
        //装载需要完善的参数
        MsMember msMember = new MsMember();
        msMember.setUname(uname);
        msMember.setEmail(email);
        msMember.setSex(sex);
        msMember.setMobile(mobile);
        msMember.setMemberId(memberId);

        msMemberMapper.updateByPrimaryKeySelective(msMember);
        result.setStatus(0);
        result.setMsg("会员信息更新成功");
        return result;
    }
    @Transactional
    @Override
    public Result resetPwd(String email) {
        Result result = new Result();
        //判断是否存在此会员
        MsMember checkMember = msMemberMapper.findByEmail(email);
        if (checkMember == null) {
            result.setStatus(-1);
            result.setMsg("此邮箱未注册，请重试");
            return result;
        }
        int memberId = checkMember.getMemberId();
        //构建动态密码
        int newPwd = new Random().nextInt(999999);
        System.out.println("newPwd：" + newPwd);
        String pwd = Integer.toString(newPwd);
        String md5_pwd = MSUtil.md5(pwd);
        //更新密码
        MsMember member = new MsMember();
        member.setMemberId(memberId);
        member.setPassword(md5_pwd);
        result.setStatus(0);
        result.setMsg("密码重置成功");
        result.setData(member);
        //向邮箱发送动态密码
        MSUtil.sendEmail(pwd, email);
        return result;
    }

    @Override
    public Result checkLogin2(String input, String password) {
        Result result = new Result();
        //手机号的正则表达式
        String regexMobile = "^1\\d{10}$";
        //邮箱的正则表达式
        String regexEmail = "\\w+@\\w+(\\.[a-zA-Z]+)+";
        if ("".equals(input)) {
            result.setStatus(-1);
            result.setMsg("请输入用户名/邮箱/手机号");
            return result;
        }
        //手机号登录
        if (input.matches(regexMobile)) {
            Map<String, Object> map = new HashMap<>();
            map.put("mobile", input);
            MsMember msMember = msMemberMapper.dynamicFind(map);
            return check(password, msMember);
        }
        //邮箱登录
        if (input.matches(regexEmail)) {
            Map<String, Object> map = new HashMap<>();
            map.put("email", input);
            MsMember msMember = msMemberMapper.dynamicFind(map);
            return check(password, msMember);
        }
        //用户名登录
        Map<String, Object> map = new HashMap<>();
        map.put("uname", input);
        MsMember msMember = msMemberMapper.dynamicFind(map);
        return check(password, msMember);

    }

    private Result check(String password, MsMember msMember) {
        Result result = new Result();
        if (msMember == null) {
            result.setStatus(-1);
            result.setMsg("此用户不存在");
            return result;
        }
        if (!MSUtil.md5(password).equals(msMember.getPassword())) {
            result.setStatus(-1);
            result.setMsg("密码错误");
            return result;
        }
        result.setStatus(0);
        result.setMsg("登陆成功");
        return result;
    }

}

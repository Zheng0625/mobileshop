package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsAdminMapper;
import com.zyb.mobileshop.dao.MsRoleMapper;
import com.zyb.mobileshop.entity.MsAdmin;
import com.zyb.mobileshop.entity.MsRole;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsAdminService;
import com.zyb.mobileshop.util.MSUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class MsAdminService_imp implements MsAdminService {
	@Resource
	private MsAdminMapper msAdminMapper;
	@Resource
	private MsRoleMapper msRoleMapper;
	
	public Result addAdmin(String mobile, String realName, int roleId) {
		Result result=new Result();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("mobile", mobile);
		MsAdmin checkAdmin=msAdminMapper.dynamicFind(map);
		if(checkAdmin!=null){
			result.setStatus(1);
			result.setMsg("此电话号码已经存在");
			return result;
		}
		MsRole role=msRoleMapper.selectByPrimaryKey(roleId);
		if(role==null){
			result.setStatus(1);
			result.setMsg("不存在此角色");
			return result;
		}
		MsAdmin admin=new MsAdmin();
		admin.setAdminId(null);
		admin.setUsername("");//默认username为空
		admin.setPassword(MSUtil.md5("111111"));//默认密码为六个1
		admin.setEmail("");//默认email为空
		admin.setRealName(realName);
		admin.setSex((short) 0);//默认为男
		admin.setMobile(mobile);
		admin.setRoleId(roleId);
		admin.setCreatime(null);
		admin.setModifytime(null);
		msAdminMapper.insert(admin);
		result.setStatus(0);
		result.setMsg("新增管理员成功");
		return result;
	}

	public Result checkLogin(String input, String password) {
		Result result=new Result();
		String regexMobile="\\d{11}";
		String regexEmail="\\w+@\\w+(\\.[a-zA-Z]+)+";
		if("".equals(input)){
			result.setStatus(1);
			result.setMsg("输入的用户名/邮箱/手机号为空");
			return result;
		}
		//手机号登录
		if(input.matches(regexMobile)){
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("mobile", input);
			MsAdmin admin=msAdminMapper.dynamicFind(map);
			return check(password,admin);
		}
		//邮箱登录
		if(input.matches(regexEmail)){
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("email", input);
			MsAdmin admin=msAdminMapper.dynamicFind(map);
			return check(password,admin);
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("username", input);
		MsAdmin admin=msAdminMapper.dynamicFind(map);
		return check(password,admin);
	}
	
	private Result check(String password, MsAdmin admin) {
		Result result=new Result();
		if(admin==null){
			result.setStatus(1);
			result.setMsg("不存在此用户");
			return result;
		}
		if(!MSUtil.md5(password).equals(admin.getPassword())){
			result.setStatus(1);
			result.setMsg("密码不正确");
			return result;
		}
		result.setStatus(0);
		result.setMsg("登录成功");
		result.setData(admin);
		return result;
	}

	public Result updateAdmin(int adminId,String username, String password, String email, int sex) {
		Result result=new Result();
		MsAdmin checkAdmin1=msAdminMapper.selectByPrimaryKey(adminId);
		if(checkAdmin1==null){
			result.setStatus(1);
			result.setMsg("不存在此管理员");
			return result;
		}
		if(!"".equals(username)){
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("username", username);
			MsAdmin checkAdmin2=msAdminMapper.dynamicFind(map);
			if(checkAdmin2!=null && !username.equals(checkAdmin1.getUsername())){
				result.setStatus(1);
				result.setMsg("用户名已经存在");
				return result;
			}
		}
		if(!"".equals(email)){
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("email", email);
			MsAdmin checkAdmin2=msAdminMapper.dynamicFind(map);
			if(checkAdmin2!=null && !email.equals(checkAdmin1.getEmail())){
				result.setStatus(1);
				result.setMsg("邮箱已经存在");
				return result;
			}
		}
		MsAdmin admin=new MsAdmin();
		admin.setAdminId(adminId);
		admin.setUsername(username);
		admin.setPassword(MSUtil.md5(password));
		admin.setEmail(email);
		admin.setSex((short) sex);
		Timestamp now=new Timestamp(System.currentTimeMillis());
		admin.setModifytime(now);
		msAdminMapper.updateByPrimaryKeySelective(admin);
		result.setStatus(0);
		result.setMsg("更新管理员基本信息成功");
		return result;
	}

	public Result updateMobileAndRealName(int adminId, String mobile, String realName) {
		Result result=new Result();
		MsAdmin checkAdmin1=msAdminMapper.selectByPrimaryKey(adminId);
		if(checkAdmin1==null){
			result.setStatus(1);
			result.setMsg("不存在此管理员");
			return result;
		}
		if(!"".equals(mobile)){
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("mobile", mobile);
			MsAdmin checkAdmin2=msAdminMapper.dynamicFind(map);
			if(checkAdmin2!=null && !mobile.equals(checkAdmin1.getMobile())){
				result.setStatus(1);
				result.setMsg("手机号已经存在");
				return result;
			}
		}
		MsAdmin admin=new MsAdmin();
		admin.setAdminId(adminId);
		admin.setMobile(mobile);
		admin.setRealName(realName);
		msAdminMapper.updateByPrimaryKeySelective(admin);
		result.setStatus(0);
		result.setMsg("更新成功");
		return result;
	}

	public Result loadAllAdmin() {
		Result result=new Result();
		List<MsAdmin> admins=msAdminMapper.findUnion();
		result.setStatus(0);
		result.setMsg("加载所有管理员成功");
		result.setData(admins);
		return result;
	}
	
	public Result loadAdminById(int adminId) {
		Result result=new Result();
		MsAdmin admin=msAdminMapper.selectByPrimaryKey(adminId);
		if(admin==null){
			result.setStatus(1);
			result.setMsg("不存在此管理员");
			return result;
		}
		result.setStatus(0);
		result.setMsg("加载管理员信息成功");
		result.setData(admin);
		return result;
	}
	
	public Result deleteAdminById(int adminId) {
		Result result=new Result();
		MsAdmin checkAdmin1=msAdminMapper.selectByPrimaryKey(adminId);
		if(checkAdmin1==null){
			result.setStatus(1);
			result.setMsg("不存在此管理员");
			return result;
		}
		msAdminMapper.deleteByPrimaryKey(adminId);
		result.setStatus(0);
		result.setMsg("删除管理员成功");
		return result;
	}

}

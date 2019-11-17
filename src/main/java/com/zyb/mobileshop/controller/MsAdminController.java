package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/admin")
public class MsAdminController {
	@Resource
	private MsAdminService msAdminService;


	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result add(String mobile, String realName, int roleId){
		Result result= msAdminService.addAdmin(mobile, realName, roleId);
		return result;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result checkLogin(String input,String password){
		Result result= msAdminService.checkLogin(input, password);
		return result;
	}
	
	@RequestMapping(value="/{adminId}",method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result updateById(@PathVariable("adminId") int adminId,
			String username,String password,String email,int sex){
		Result result= msAdminService.updateAdmin(adminId, username, password, email, sex);
		return result;
	}
	
	@RequestMapping(value="/mobile_realName/{adminId}",method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result updateMobileAndRealName(@PathVariable("adminId") int adminId,
			String mobile,String realName){
		Result result= msAdminService.updateMobileAndRealName(adminId, mobile, realName);
		return result;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result loadAll(){
		Result result= msAdminService.loadAllAdmin();
		return result;
	}
	
	@RequestMapping(value="/{adminId}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result loadById(@PathVariable("adminId") int adminId){
		Result result= msAdminService.loadAdminById(adminId);
		return result;
	}
	
	@RequestMapping(value="/{adminId}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result deleteById(@PathVariable("adminId") int adminId){
		Result result= msAdminService.deleteAdminById(adminId);
		return result;
	}
	
}

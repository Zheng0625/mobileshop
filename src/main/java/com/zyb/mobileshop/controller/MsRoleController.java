package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsRoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/role")
public class MsRoleController {
	@Resource
	private MsRoleService msRoleService;
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result add(String name, String description){
		Result result= msRoleService.addRole(name, description);
		return result;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result loadAll(){
		Result result= msRoleService.loadAllRole();
		return result;
	}
	
	@RequestMapping(value="/{roleId}",method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result updateById(@PathVariable("roleId") int roleId,String name,String description){
		Result result= msRoleService.updateRole(roleId, name, description);
		return result;
	}
	
	@RequestMapping(value="/{roleId}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result deleteById(@PathVariable("roleId") int roleId){
		Result result= msRoleService.deleteRoleById(roleId);
		return result;
	}
}

package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsRoleService {
	public Result addRole(String name, String description);
	public Result loadAllRole();
	public Result updateRole(int roleId,String name,String description);
	public Result deleteRoleById(int roleId);
}

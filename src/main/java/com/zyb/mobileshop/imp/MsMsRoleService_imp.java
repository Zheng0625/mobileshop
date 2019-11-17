package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsRoleMapper;
import com.zyb.mobileshop.entity.MsRole;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;
@Service
public class MsMsRoleService_imp implements MsRoleService {
	@Resource
	private MsRoleMapper roleDao;
	
	public Result addRole(String name, String description) {
		Result result=new Result();
		MsRole checkRole=roleDao.findByName(name);
		if(checkRole!=null){
			result.setStatus(1);
			result.setMsg("已经存在此角色名");
			return result;
		}
		MsRole role=new MsRole();
		role.setRoleId(null);
		role.setName(name);
		role.setDescription(description);
		role.setCreatime(null);
		role.setModifytime(null);
		roleDao.insert(role);
		result.setStatus(0);
		result.setMsg("新增角色成功");
		return result;
	}
	public Result loadAllRole() {
		Result result=new Result();
		List<MsRole> roles=roleDao.findAll();
		result.setStatus(0);
		result.setMsg("加载所有角色成功");
		result.setData(roles);
		return result;
	}
	public Result updateRole(int roleId, String name, String description) {
		Result result=new Result();
		MsRole checkRole1=roleDao.selectByPrimaryKey(roleId);
		if(checkRole1==null){
			result.setStatus(1);
			result.setMsg("不存在此角色");
			return result;
		}
		MsRole checkRole2=roleDao.findByName(name);
		if(checkRole2!=null){
			result.setStatus(1);
			result.setMsg("已经存在此角色名");
			return result;
		}
		MsRole role=new MsRole();
		role.setRoleId(roleId);
		role.setName(name);
		role.setDescription(description);
		Timestamp now=new Timestamp(System.currentTimeMillis());
		role.setModifytime(now);
		roleDao.updateByPrimaryKeySelective(role);
		result.setStatus(0);
		result.setMsg("更新角色信息成功");
		return result;
	}
	public Result deleteRoleById(int roleId) {
		Result result=new Result();
		MsRole checkRole=roleDao.selectByPrimaryKey(roleId);
		if(checkRole==null){
			result.setStatus(1);
			result.setMsg("不存在此角色");
			return result;
		}
		roleDao.deleteByPrimaryKey(roleId);
		result.setStatus(0);
		result.setMsg("删除此角色成功");
		return result;
	}

}

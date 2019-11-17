package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsRole;
import com.zyb.mobileshop.entity.MsRoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MsRoleMapper {
    long countByExample(MsRoleExample example);

    int deleteByExample(MsRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(MsRole record);

    int insertSelective(MsRole record);

    List<MsRole> selectByExample(MsRoleExample example);

    MsRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") MsRole record, @Param("example") MsRoleExample example);

    int updateByExample(@Param("record") MsRole record, @Param("example") MsRoleExample example);

    int updateByPrimaryKeySelective(MsRole record);

    int updateByPrimaryKey(MsRole record);

    List<MsRole> findAll();

    MsRole findByName(String name);
}
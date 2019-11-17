package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsMember;
import com.zyb.mobileshop.entity.MsMemberExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MsMemberMapper {
    long countByExample(MsMemberExample example);

    int deleteByExample(MsMemberExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(MsMember record);

    int insertSelective(MsMember record);

    List<MsMember> selectByExample(MsMemberExample example);

    MsMember selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") MsMember record, @Param("example") MsMemberExample example);

    int updateByExample(@Param("record") MsMember record, @Param("example") MsMemberExample example);

    int updateByPrimaryKeySelective(MsMember record);

    int updateByPrimaryKey(MsMember record);

    MsMember findByName(String uname);//根据uname查询

    MsMember findByEmail(String email);//根据email查询

    MsMember findById(int member_id);//根据id查询

    MsMember dynamicFind(Map map);//自定义动态查询

}
package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsAdmin;
import com.zyb.mobileshop.entity.MsAdminExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MsAdminMapper {
    long countByExample(MsAdminExample example);

    int deleteByExample(MsAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(MsAdmin record);

    int insertSelective(MsAdmin record);

    List<MsAdmin> selectByExample(MsAdminExample example);

    MsAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") MsAdmin record, @Param("example") MsAdminExample example);

    int updateByExample(@Param("record") MsAdmin record, @Param("example") MsAdminExample example);

    int updateByPrimaryKeySelective(MsAdmin record);

    int updateByPrimaryKey(MsAdmin record);

    MsAdmin dynamicFind(Map map);

    List<MsAdmin> findUnion();
}
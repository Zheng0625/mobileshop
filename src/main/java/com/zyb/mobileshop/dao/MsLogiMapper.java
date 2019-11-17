package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsLogi;
import com.zyb.mobileshop.entity.MsLogiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsLogiMapper {
    long countByExample(MsLogiExample example);

    int deleteByExample(MsLogiExample example);

    int deleteByPrimaryKey(Integer logiId);

    int insert(MsLogi record);

    int insertSelective(MsLogi record);

    List<MsLogi> selectByExample(MsLogiExample example);

    MsLogi selectByPrimaryKey(Integer logiId);

    int updateByExampleSelective(@Param("record") MsLogi record, @Param("example") MsLogiExample example);

    int updateByExample(@Param("record") MsLogi record, @Param("example") MsLogiExample example);

    int updateByPrimaryKeySelective(MsLogi record);

    int updateByPrimaryKey(MsLogi record);
}
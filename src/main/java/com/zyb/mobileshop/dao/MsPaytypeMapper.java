package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsPaytype;
import com.zyb.mobileshop.entity.MsPaytypeExample;
import com.zyb.mobileshop.entity.MsPaytypeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsPaytypeMapper {
    long countByExample(MsPaytypeExample example);

    int deleteByExample(MsPaytypeExample example);

    int deleteByPrimaryKey(Integer paytypeId);

    int insert(MsPaytypeWithBLOBs record);

    int insertSelective(MsPaytypeWithBLOBs record);

    List<MsPaytypeWithBLOBs> selectByExampleWithBLOBs(MsPaytypeExample example);

    List<MsPaytype> selectByExample(MsPaytypeExample example);

    MsPaytypeWithBLOBs selectByPrimaryKey(Integer paytypeId);

    int updateByExampleSelective(@Param("record") MsPaytypeWithBLOBs record, @Param("example") MsPaytypeExample example);

    int updateByExampleWithBLOBs(@Param("record") MsPaytypeWithBLOBs record, @Param("example") MsPaytypeExample example);

    int updateByExample(@Param("record") MsPaytype record, @Param("example") MsPaytypeExample example);

    int updateByPrimaryKeySelective(MsPaytypeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MsPaytypeWithBLOBs record);

    int updateByPrimaryKey(MsPaytype record);
}
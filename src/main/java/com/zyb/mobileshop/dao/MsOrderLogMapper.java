package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsOrderLog;
import com.zyb.mobileshop.entity.MsOrderLogExample;
import java.util.List;

import com.zyb.mobileshop.entity.brief.BriefOrderLog;
import org.apache.ibatis.annotations.Param;

public interface MsOrderLogMapper {
    long countByExample(MsOrderLogExample example);

    int deleteByExample(MsOrderLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(MsOrderLog record);

    int insertSelective(MsOrderLog record);

    List<MsOrderLog> selectByExample(MsOrderLogExample example);

    MsOrderLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") MsOrderLog record, @Param("example") MsOrderLogExample example);

    int updateByExample(@Param("record") MsOrderLog record, @Param("example") MsOrderLogExample example);

    int updateByPrimaryKeySelective(MsOrderLog record);

    int updateByPrimaryKey(MsOrderLog record);

    List<BriefOrderLog> findByOrderId(int order_id);
}
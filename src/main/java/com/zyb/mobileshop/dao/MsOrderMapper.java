package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsOrder;
import com.zyb.mobileshop.entity.MsOrderExample;
import java.util.List;

import com.zyb.mobileshop.entity.brief.BriefOrder;
import org.apache.ibatis.annotations.Param;

public interface MsOrderMapper {
    long countByExample(MsOrderExample example);

    int deleteByExample(MsOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(MsOrder record);

    int insertSelective(MsOrder record);

    List<MsOrder> selectByExample(MsOrderExample example);

    MsOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") MsOrder record, @Param("example") MsOrderExample example);

    int updateByExample(@Param("record") MsOrder record, @Param("example") MsOrderExample example);

    int updateByPrimaryKeySelective(MsOrder record);

    int updateByPrimaryKey(MsOrder record);

    List<MsOrder> findUnionByMemberId(int member_id);

    List<BriefOrder> findUnionByStatus(int status);
}
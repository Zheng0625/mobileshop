package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsPayment;
import com.zyb.mobileshop.entity.MsPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsPaymentMapper {
    long countByExample(MsPaymentExample example);

    int deleteByExample(MsPaymentExample example);

    int deleteByPrimaryKey(Integer paymentId);

    int insert(MsPayment record);

    int insertSelective(MsPayment record);

    List<MsPayment> selectByExampleWithBLOBs(MsPaymentExample example);

    List<MsPayment> selectByExample(MsPaymentExample example);

    MsPayment selectByPrimaryKey(Integer paymentId);

    int updateByExampleSelective(@Param("record") MsPayment record, @Param("example") MsPaymentExample example);

    int updateByExampleWithBLOBs(@Param("record") MsPayment record, @Param("example") MsPaymentExample example);

    int updateByExample(@Param("record") MsPayment record, @Param("example") MsPaymentExample example);

    int updateByPrimaryKeySelective(MsPayment record);

    int updateByPrimaryKeyWithBLOBs(MsPayment record);

    int updateByPrimaryKey(MsPayment record);
}
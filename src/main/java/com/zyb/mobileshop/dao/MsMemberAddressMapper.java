package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsMemberAddress;
import com.zyb.mobileshop.entity.MsMemberAddressExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MsMemberAddressMapper {
    long countByExample(MsMemberAddressExample example);

    int deleteByExample(MsMemberAddressExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(MsMemberAddress record);

    int insertSelective(MsMemberAddress record);

    List<MsMemberAddress> selectByExampleWithBLOBs(MsMemberAddressExample example);

    List<MsMemberAddress> selectByExample(MsMemberAddressExample example);

    MsMemberAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") MsMemberAddress record, @Param("example") MsMemberAddressExample example);

    int updateByExampleWithBLOBs(@Param("record") MsMemberAddress record, @Param("example") MsMemberAddressExample example);

    int updateByExample(@Param("record") MsMemberAddress record, @Param("example") MsMemberAddressExample example);

    int updateByPrimaryKeySelective(MsMemberAddress record);

    int updateByPrimaryKeyWithBLOBs(MsMemberAddress record);

    int updateByPrimaryKey(MsMemberAddress record);

    List<MsMemberAddress> findUnion(Integer memberId);

    MsMemberAddress findById(Integer addressId);

    int dynamicUpdate(MsMemberAddress record);
}
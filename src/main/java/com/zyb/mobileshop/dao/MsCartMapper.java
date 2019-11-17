package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsCart;
import com.zyb.mobileshop.entity.MsCartExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MsCartMapper {
    long countByExample(MsCartExample example);

    int deleteByExample(MsCartExample example);

    int deleteByPrimaryKey(Integer cartId);

    int insert(MsCart record);

    int insertSelective(MsCart record);

    List<MsCart> selectByExample(MsCartExample example);

    MsCart selectByPrimaryKey(Integer cartId);

    int updateByExampleSelective(@Param("record") MsCart record, @Param("example") MsCartExample example);

    int updateByExample(@Param("record") MsCart record, @Param("example") MsCartExample example);

    int updateByPrimaryKeySelective(MsCart record);

    int updateByPrimaryKey(MsCart record);

    List<MsCart> findUnionByMemberId(Map map);

    List<MsCart> dynamicFind(MsCart cart);
}
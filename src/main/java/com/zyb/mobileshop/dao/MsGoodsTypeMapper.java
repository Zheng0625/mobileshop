package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsGoodsType;
import com.zyb.mobileshop.entity.MsGoodsTypeExample;

import java.util.List;

import com.zyb.mobileshop.entity.MsTypeBrand;
import org.apache.ibatis.annotations.Param;

public interface MsGoodsTypeMapper {
    long countByExample(MsGoodsTypeExample example);

    int deleteByExample(MsGoodsTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(MsGoodsType record);

    int insertSelective(MsGoodsType record);

    List<MsGoodsType> selectByExampleWithBLOBs(MsGoodsTypeExample example);

    List<MsGoodsType> selectByExample(MsGoodsTypeExample example);

    MsGoodsType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") MsGoodsType record, @Param("example") MsGoodsTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") MsGoodsType record, @Param("example") MsGoodsTypeExample example);

    int updateByExample(@Param("record") MsGoodsType record, @Param("example") MsGoodsTypeExample example);

    int updateByPrimaryKeySelective(MsGoodsType record);

    int updateByPrimaryKeyWithBLOBs(MsGoodsType record);

    int updateByPrimaryKey(MsGoodsType record);

    MsGoodsType findByName(String name);

    MsGoodsType findById(int typeId);

    List<MsGoodsType> fingByDisabled(int disabled);
}
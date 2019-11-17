package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsTypeBrand;
import com.zyb.mobileshop.entity.MsTypeBrandExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MsTypeBrandMapper {
    long countByExample(MsTypeBrandExample example);

    int deleteByExample(MsTypeBrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsTypeBrand record);

    int insertSelective(MsTypeBrand record);

    List<MsTypeBrand> selectByExample(MsTypeBrandExample example);

    MsTypeBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsTypeBrand record, @Param("example") MsTypeBrandExample example);

    int updateByExample(@Param("record") MsTypeBrand record, @Param("example") MsTypeBrandExample example);

    int updateByPrimaryKeySelective(MsTypeBrand record);

    int updateByPrimaryKey(MsTypeBrand record);

    List<MsTypeBrand> findByTypeId(int type_id);

    List<MsTypeBrand> findUnion();

    List<MsTypeBrand> findUnionByTypeId(int type_id);

    List<MsTypeBrand> findByBrandId(int brand_id);

    MsTypeBrand findUnionById(int id);

    List<MsTypeBrand> findUnionByBrandId(int brand_id);


}
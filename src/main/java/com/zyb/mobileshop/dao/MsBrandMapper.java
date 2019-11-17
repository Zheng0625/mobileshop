package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsBrand;
import com.zyb.mobileshop.entity.MsBrandExample;
import com.zyb.mobileshop.entity.MsBrandWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsBrandMapper {
    long countByExample(MsBrandExample example);

    int deleteByExample(MsBrandExample example);

    int deleteByPrimaryKey(Integer brandId);

    int insert(MsBrandWithBLOBs record);

    int insertSelective(MsBrandWithBLOBs record);

    List<MsBrandWithBLOBs> selectByExampleWithBLOBs(MsBrandExample example);

    List<MsBrand> selectByExample(MsBrandExample example);

    MsBrandWithBLOBs selectByPrimaryKey(Integer brandId);

    int updateByExampleSelective(@Param("record") MsBrandWithBLOBs record, @Param("example") MsBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") MsBrandWithBLOBs record, @Param("example") MsBrandExample example);

    int updateByExample(@Param("record") MsBrand record, @Param("example") MsBrandExample example);

    int updateByPrimaryKeySelective(MsBrandWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MsBrandWithBLOBs record);

    int updateByPrimaryKey(MsBrand record);

    MsBrand findByName(String name);

}
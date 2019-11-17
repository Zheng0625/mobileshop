package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsTagBrandRef;
import com.zyb.mobileshop.entity.MsTagBrandRefExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MsTagBrandRefMapper {
    long countByExample(MsTagBrandRefExample example);

    int deleteByExample(MsTagBrandRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsTagBrandRef record);

    int insertSelective(MsTagBrandRef record);

    List<MsTagBrandRef> selectByExample(MsTagBrandRefExample example);

    MsTagBrandRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsTagBrandRef record, @Param("example") MsTagBrandRefExample example);

    int updateByExample(@Param("record") MsTagBrandRef record, @Param("example") MsTagBrandRefExample example);

    int updateByPrimaryKeySelective(MsTagBrandRef record);

    int updateByPrimaryKey(MsTagBrandRef record);

    List<MsTagBrandRef> findUnionByTagId(int tag_id);

    MsTagBrandRef findRepeat(Map map);
}
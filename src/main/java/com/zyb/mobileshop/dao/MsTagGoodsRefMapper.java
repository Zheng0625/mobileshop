package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsTagGoodsRef;
import com.zyb.mobileshop.entity.MsTagGoodsRefExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MsTagGoodsRefMapper {
    long countByExample(MsTagGoodsRefExample example);

    int deleteByExample(MsTagGoodsRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsTagGoodsRef record);

    int insertSelective(MsTagGoodsRef record);

    List<MsTagGoodsRef> selectByExample(MsTagGoodsRefExample example);

    MsTagGoodsRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsTagGoodsRef record, @Param("example") MsTagGoodsRefExample example);

    int updateByExample(@Param("record") MsTagGoodsRef record, @Param("example") MsTagGoodsRefExample example);

    int updateByPrimaryKeySelective(MsTagGoodsRef record);

    int updateByPrimaryKey(MsTagGoodsRef record);

    MsTagGoodsRef findRepeat(Map map);

    List<MsTagGoodsRef> findUnionByTagId(int tag_id);

}
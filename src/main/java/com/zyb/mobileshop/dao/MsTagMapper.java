package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsTag;
import com.zyb.mobileshop.entity.MsTagExample;

import java.util.List;
import java.util.Map;

import com.zyb.mobileshop.entity.MsTagGoodsRefExample;
import com.zyb.mobileshop.entity.brief.BriefTag;
import com.zyb.mobileshop.util.Page;
import org.apache.ibatis.annotations.Param;

public interface MsTagMapper {
    long countByExample(MsTagExample example);

    int deleteByExample(MsTagExample example);

    int deleteByPrimaryKey(Integer tagId);

    int insert(MsTag record);

    int insertSelective(MsTag record);

    List<MsTag> selectByExample(MsTagExample example);

    MsTag selectByPrimaryKey(Integer tagId);

    int updateByExampleSelective(@Param("record") MsTag record, @Param("example") MsTagExample example);

    int updateByExample(@Param("record") MsTag record, @Param("example") MsTagExample example);

    int updateByPrimaryKeySelective(MsTag record);

    int updateByPrimaryKey(MsTag record);

    MsTag findByName(String name);

    List<MsTag> findAllByPage(Page page);

    List<BriefTag> findUnionByGoodsTagId(int tag_id);

    List<MsTag> findByTypeAndTeam(Map map);


}
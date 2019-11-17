package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsGoodsCat;
import com.zyb.mobileshop.entity.MsGoodsCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsGoodsCatMapper {
    long countByExample(MsGoodsCatExample example);

    int deleteByExample(MsGoodsCatExample example);

    int deleteByPrimaryKey(Integer catId);

    int insert(MsGoodsCat record);

    int insertSelective(MsGoodsCat record);

    List<MsGoodsCat> selectByExample(MsGoodsCatExample example);

    MsGoodsCat selectByPrimaryKey(Integer catId);

    int updateByExampleSelective(@Param("record") MsGoodsCat record, @Param("example") MsGoodsCatExample example);

    int updateByExample(@Param("record") MsGoodsCat record, @Param("example") MsGoodsCatExample example);

    int updateByPrimaryKeySelective(MsGoodsCat record);

    int updateByPrimaryKey(MsGoodsCat record);

    MsGoodsCat findByName(String name);

    List<MsGoodsCat> findByCatPathDESC(int lenth);

    List<MsGoodsCat> findByParentIdDESC(int parent_id);

    MsGoodsCat findById(int cat_id);

    List<MsGoodsCat> dynamicFind(MsGoodsCat record);



}
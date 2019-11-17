package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsGoodsImg;
import com.zyb.mobileshop.entity.MsGoodsImgExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MsGoodsImgMapper {
    long countByExample(MsGoodsImgExample example);

    int deleteByExample(MsGoodsImgExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(MsGoodsImg record);

    int insertSelective(MsGoodsImg record);

    List<MsGoodsImg> selectByExample(MsGoodsImgExample example);

    MsGoodsImg selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") MsGoodsImg record, @Param("example") MsGoodsImgExample example);

    int updateByExample(@Param("record") MsGoodsImg record, @Param("example") MsGoodsImgExample example);

    int updateByPrimaryKeySelective(MsGoodsImg record);

    int updateByPrimaryKey(MsGoodsImg record);

    MsGoodsImg findByGoodsIdAndIsdefault(Map map);
}
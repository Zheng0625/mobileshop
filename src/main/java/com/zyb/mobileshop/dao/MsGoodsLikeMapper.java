package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsGoodsLike;
import com.zyb.mobileshop.entity.MsGoodsLikeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MsGoodsLikeMapper {
    long countByExample(MsGoodsLikeExample example);

    int deleteByExample(MsGoodsLikeExample example);

    int deleteByPrimaryKey(Integer likeId);

    int insert(MsGoodsLike record);

    int insertSelective(MsGoodsLike record);

    List<MsGoodsLike> selectByExample(MsGoodsLikeExample example);

    MsGoodsLike selectByPrimaryKey(Integer likeId);

    int updateByExampleSelective(@Param("record") MsGoodsLike record, @Param("example") MsGoodsLikeExample example);

    int updateByExample(@Param("record") MsGoodsLike record, @Param("example") MsGoodsLikeExample example);

    int updateByPrimaryKeySelective(MsGoodsLike record);

    int updateByPrimaryKey(MsGoodsLike record);

    MsGoodsLike findRepeat(Map map);
}
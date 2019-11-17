package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsGoodsComment;
import com.zyb.mobileshop.entity.MsGoodsCommentExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MsGoodsCommentMapper {
    long countByExample(MsGoodsCommentExample example);

    int deleteByExample(MsGoodsCommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(MsGoodsComment record);

    int insertSelective(MsGoodsComment record);

    List<MsGoodsComment> selectByExampleWithBLOBs(MsGoodsCommentExample example);

    List<MsGoodsComment> selectByExample(MsGoodsCommentExample example);

    MsGoodsComment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") MsGoodsComment record, @Param("example") MsGoodsCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") MsGoodsComment record, @Param("example") MsGoodsCommentExample example);

    int updateByExample(@Param("record") MsGoodsComment record, @Param("example") MsGoodsCommentExample example);

    int updateByPrimaryKeySelective(MsGoodsComment record);

    int updateByPrimaryKeyWithBLOBs(MsGoodsComment record);

    int updateByPrimaryKey(MsGoodsComment record);

    List<MsGoodsComment> findUnionByGoodsId(int goods_id);

    List<MsGoodsComment> findUnionByMemberId(int member_id);
}
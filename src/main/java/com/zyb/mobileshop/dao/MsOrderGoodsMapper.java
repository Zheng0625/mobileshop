package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsOrderGoods;
import com.zyb.mobileshop.entity.MsOrderGoodsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MsOrderGoodsMapper {
    long countByExample(MsOrderGoodsExample example);

    int deleteByExample(MsOrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsOrderGoods record);

    int insertSelective(MsOrderGoods record);

    List<MsOrderGoods> selectByExample(MsOrderGoodsExample example);

    MsOrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsOrderGoods record, @Param("example") MsOrderGoodsExample example);

    int updateByExample(@Param("record") MsOrderGoods record, @Param("example") MsOrderGoodsExample example);

    int updateByPrimaryKeySelective(MsOrderGoods record);

    int updateByPrimaryKey(MsOrderGoods record);

    MsOrderGoods findRepeat(Map map);

    List<MsOrderGoods> findUnionByOrderId(int orderId);
}
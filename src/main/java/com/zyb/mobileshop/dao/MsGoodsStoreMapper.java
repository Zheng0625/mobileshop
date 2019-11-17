package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsGoods;
import com.zyb.mobileshop.entity.MsGoodsStore;
import com.zyb.mobileshop.entity.MsGoodsStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsGoodsStoreMapper {
    long countByExample(MsGoodsStoreExample example);

    int deleteByExample(MsGoodsStoreExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(MsGoodsStore record);

    int insertSelective(MsGoodsStore record);

    List<MsGoodsStore> selectByExample(MsGoodsStoreExample example);

    MsGoodsStore selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") MsGoodsStore record, @Param("example") MsGoodsStoreExample example);

    int updateByExample(@Param("record") MsGoodsStore record, @Param("example") MsGoodsStoreExample example);

    int updateByPrimaryKeySelective(MsGoodsStore record);

    int updateByPrimaryKey(MsGoodsStore record);

    MsGoodsStore findByGoodsId(int goodsId);
}
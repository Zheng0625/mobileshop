package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsGoods;
import com.zyb.mobileshop.entity.MsGoodsExample;
import com.zyb.mobileshop.entity.MsGoodsWithBLOBs;
import java.util.List;
import java.util.Map;

import com.zyb.mobileshop.entity.brief.BriefGoods;
import com.zyb.mobileshop.util.Page;
import org.apache.ibatis.annotations.Param;

public interface MsGoodsMapper {
    long countByExample(MsGoodsExample example);

    int deleteByExample(MsGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(MsGoodsWithBLOBs record);

    int insertSelective(MsGoodsWithBLOBs record);

    List<MsGoodsWithBLOBs> selectByExampleWithBLOBs(MsGoodsExample example);

    List<MsGoods> selectByExample(MsGoodsExample example);

    MsGoodsWithBLOBs selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") MsGoodsWithBLOBs record, @Param("example") MsGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") MsGoodsWithBLOBs record, @Param("example") MsGoodsExample example);

    int updateByExample(@Param("record") MsGoods record, @Param("example") MsGoodsExample example);

    int updateByPrimaryKeySelective(MsGoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MsGoodsWithBLOBs record);

    int updateByPrimaryKey(MsGoods record);

    List<BriefGoods> dynamicFind(Map map);

    BriefGoods findByName(String name);

    List<BriefGoods> findUnionByPage(Page page);

    MsGoods findUnionById(int goodsId);

}
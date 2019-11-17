package com.zyb.mobileshop.dao;

import com.zyb.mobileshop.entity.MsShip;
import com.zyb.mobileshop.entity.MsShipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsShipMapper {
    long countByExample(MsShipExample example);

    int deleteByExample(MsShipExample example);

    int deleteByPrimaryKey(Integer shipId);

    int insert(MsShip record);

    int insertSelective(MsShip record);

    List<MsShip> selectByExample(MsShipExample example);

    MsShip selectByPrimaryKey(Integer shipId);

    int updateByExampleSelective(@Param("record") MsShip record, @Param("example") MsShipExample example);

    int updateByExample(@Param("record") MsShip record, @Param("example") MsShipExample example);

    int updateByPrimaryKeySelective(MsShip record);

    int updateByPrimaryKey(MsShip record);
}
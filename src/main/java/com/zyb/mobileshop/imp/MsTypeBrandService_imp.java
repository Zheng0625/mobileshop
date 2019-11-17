package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsBrandMapper;
import com.zyb.mobileshop.dao.MsGoodsTypeMapper;
import com.zyb.mobileshop.dao.MsTypeBrandMapper;
import com.zyb.mobileshop.entity.MsBrand;
import com.zyb.mobileshop.entity.MsGoodsType;
import com.zyb.mobileshop.entity.MsTypeBrand;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsTypeBrandService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class MsTypeBrandService_imp implements MsTypeBrandService {
    @Resource
    private MsTypeBrandMapper msTypeBrandMapper;
    @Resource
    private MsGoodsTypeMapper msGoodsTypeMapper;
    @Resource
    private MsBrandMapper msBrandMapper;

    //新增类型品牌关联信息
    @Transactional
    @Override
    public Result add(int typeId, int brandId) {
        Result result = new Result();
        MsGoodsType msGoodsType = msGoodsTypeMapper.findById(typeId);
        //判断是否存在此商品类型
        if (msGoodsType == null) {
            result.setStatus(-1);
            result.setMsg("不存在此商品类型");
            return result;
        }
        //判断此商品类型是否可用
        if (msGoodsType.getDisabled() == 1) {
            result.setStatus(-1);
            result.setMsg("此商品类型不可用");
            return result;
        }
        MsBrand msBrand = msBrandMapper.selectByPrimaryKey(brandId);
        //判断是否存在此品牌
        if (msBrand == null) {
            result.setStatus(-1);
            result.setMsg("该品牌不存在");
            return result;

        }
        //判断此品牌是否可用
        if (msBrand.getDisabled() == 1) {
            result.setStatus(-1);
            result.setMsg("此品牌不可用");
            return result;
        }
        //判断是否已经关联过
        List<MsTypeBrand> msTypeBrandList = msTypeBrandMapper.findByTypeId(typeId);
        if (!msTypeBrandList.isEmpty()) {
            for (MsTypeBrand msTypeBrand : msTypeBrandList) {
                result.setStatus(-1);
                result.setMsg("此类型已经关联过此品牌");
                return result;
            }
        }
        MsTypeBrand typeBrand = new MsTypeBrand();
        typeBrand.setTypeId(typeId);
        typeBrand.setBrandId(brandId);
        typeBrand.setCreatime(null);
        typeBrand.setModifytime(null);
        msTypeBrandMapper.insert(typeBrand);
        result.setStatus(0);
        result.setMsg("商品类型与品牌关联成功");
        result.setData(typeBrand);
        return result;
    }

    @Override
    public Result loadAll() {
        Result result = new Result();
        List<MsTypeBrand> typeBrandList = msTypeBrandMapper.findUnion();
        //判断是否有类型品牌的关联信息
        if (typeBrandList.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("没有类型关联");
            result.setData(typeBrandList);
            return result;
        }
        result.setStatus(0);
        result.setMsg("加载所有类型品牌关联信息成功");
        result.setData(typeBrandList);
        return result;
    }

    @Transactional
    @Override
    //根据id更新类型品牌关系
    public Result update(int id, int typeId, int brandId) {
        Result result = new Result();
        //判断是否有此类型品牌关联信息
        MsTypeBrand checkTB = msTypeBrandMapper.selectByPrimaryKey(id);
        if (checkTB == null) {
            result.setStatus(-1);
            result.setMsg("没有此类型品牌关联信息");
            return result;
        }
        MsGoodsType msGoodsType = msGoodsTypeMapper.findById(typeId);
        //判断是否有此商品类型
        if (msGoodsType == null) {
            result.setStatus(-1);
            result.setMsg("没有此商品类型");
            return result;
        }
        //判断此商品类型是否可用
        if (msGoodsType.getDisabled() == 1) {
            result.setStatus(-1);
            result.setMsg("此商品类型不可用");
            return result;
        }
        MsBrand msBrand = msBrandMapper.selectByPrimaryKey(brandId);
        //判断是否有此品牌
        if (msBrand == null) {
            result.setStatus(-1);
            result.setMsg("没有此品牌");
            return result;
        }
        //判断此品牌是否可用
        if (msBrand.getDisabled() == 1) {
            result.setStatus(-1);
            result.setMsg("此品牌不可用");
            return result;
        }
        MsTypeBrand typeBrand = new MsTypeBrand();
        typeBrand.setTypeId(typeId);
        typeBrand.setBrandId(brandId);
        Timestamp now = new Timestamp(System.currentTimeMillis());
        typeBrand.setModifytime(now);
        msTypeBrandMapper.updateByPrimaryKeySelective(typeBrand);
        result.setStatus(0);
        result.setMsg("更新类型品牌关系成功");
        result.setData(msBrand);
        return result;
    }
}

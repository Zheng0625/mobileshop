package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsGoodsTypeMapper;
import com.zyb.mobileshop.dao.MsTypeBrandMapper;
import com.zyb.mobileshop.entity.MsGoodsType;
import com.zyb.mobileshop.entity.MsTypeBrand;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsTypeService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MsGoodsTypeService_imp implements MsGoodsTypeService {

    @Resource
    private MsGoodsTypeMapper msGoodsTypeMapper;
    @Resource
    private MsTypeBrandMapper msTypeBrandMapper;

    @Transactional
    @Override
    //新增类型
    public Result addType(String name, String[] paramsKey, int isPhysical) {
        Result result = new Result();
        //判断是否存在此类型
        MsGoodsType goodsType = msGoodsTypeMapper.findByName(name);
        if (goodsType != null) {
            result.setStatus(-1);
            result.setMsg("该类型已存在");
            return result;
        }
        //构建参数,最多传递5个
        //因为一个类型的参数有很多，所以采用map形式
        Map<String, Object> map = new HashMap<>();
        //循环向map中增加参数名
        for(int i=0;i<=(paramsKey.length-1);i++){
            if(!"".equals(paramsKey[i]))
                map.put(paramsKey[i], "");
        }
        JSONObject jsonObject = JSONObject.fromObject(map);
        //装载参数
        MsGoodsType msGoodsType = new MsGoodsType();
        msGoodsType.setName(name);
        msGoodsType.setParams(jsonObject.toString());
        msGoodsType.setDisabled((byte) 0);//默认可用
        msGoodsType.setIsPhysical((byte) isPhysical);
        msGoodsType.setCreatime(null);
        msGoodsType.setModifytime(null);
        msGoodsTypeMapper.insert(msGoodsType);
        result.setStatus(0);
        result.setMsg("新增商品分类成功");
        result.setData(msGoodsType);
        return result;
    }

    @Transactional
    @Override
    //根据id更新disabled
    public Result updateDisabled(int typeId, int disabled) {
        Result result = new Result();
        //查看是否存在此商品类型
        MsGoodsType goodsType = msGoodsTypeMapper.findById(typeId);
        if (goodsType == null) {
            result.setStatus(-1);
            result.setMsg("没有该商品类型");
            return result;
        }
        //查看是否已经关联品牌
        List<MsTypeBrand> msTypeBrandList = msTypeBrandMapper.findByTypeId(typeId);
        if (!msTypeBrandList.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("此类型已关联商品");
            return result;
        }
        MsGoodsType msGoodsType = new MsGoodsType();
        msGoodsType.setTypeId(typeId);
        msGoodsType.setDisabled((byte) disabled);
        Timestamp now = new Timestamp(System.currentTimeMillis());
        msGoodsType.setModifytime(now);
        msGoodsTypeMapper.updateByPrimaryKeySelective(msGoodsType);
        result.setStatus(0);
        result.setMsg("更新类型状态成功");
        return result;
    }

    @Override
    //加载所有可用的商品类型
    public Result loadTypeByDisabled() {
        Result result = new Result();
        //可用的disabled 为0
        List<MsGoodsType> list = msGoodsTypeMapper.fingByDisabled(0);
        //判断是否可用的商品类型
        if (list.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("没有可用的商品类型");
            return result;
        }
        result.setStatus(0);
        result.setMsg("加载可用商品类型成功");
        result.setData(list);
        return result;
    }

}

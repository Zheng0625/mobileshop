package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsGoodsMapper;
import com.zyb.mobileshop.dao.MsGoodsStoreMapper;
import com.zyb.mobileshop.entity.MsGoods;
import com.zyb.mobileshop.entity.MsGoodsStore;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsStoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;

@Service
public class MsGoodsStoreService_imp implements MsGoodsStoreService {

    @Resource
    private MsGoodsStoreMapper msGoodsStoreMapper;
    @Resource
    private MsGoodsMapper msGoodsMapper;

    @Transactional
    @Override
    //新增商品库存
    public Result addStore(int goodsId, int store) {
        Result result = new Result();
        MsGoods goods = msGoodsMapper.selectByPrimaryKey(goodsId);
        //判断是否存在此商品
        if (goods == null) {
            result.setStatus(-1);
            result.setMsg("此商品不存在");
            return result;
        }
        //判断此商品是否已下架
        if (goods.getMktEnable() != 0) {
            result.setStatus(-1);
            result.setMsg("此商品已下架");
            return result;
        }
        //判断是否已经存在此商品的库存
        MsGoodsStore checkGS = msGoodsStoreMapper.findByGoodsId(goodsId);
        if (checkGS != null) {
            result.setStatus(-1);
            result.setMsg("已存在该商品的库存信息");
            return result;
        }
        MsGoodsStore goodsStore = new MsGoodsStore();
        goodsStore.setGoodsId(goodsId);
        goodsStore.setStore(store);
        goodsStore.setEnableStore(store);
        goodsStore.setOperateType((byte) 0);//0:入库，1：出库
        goodsStore.setIntime(null);
        goodsStore.setOuttime(null);
        msGoodsStoreMapper.insert(goodsStore);
        result.setStatus(0);
        result.setMsg("新增商品库存成功");
        result.setData(goodsStore);
        return result;
    }

    @Transactional
    @Override
    //根据id更新库存
    public Result updateStore(int storeId, int store) {
        Result result = new Result();
        MsGoodsStore checkGS = msGoodsStoreMapper.selectByPrimaryKey(storeId);
        if (checkGS == null) {
            result.setStatus(-1);
            result.setMsg("没有此库存");
            return result;
        }
        int oldStore = checkGS.getStore();
        int updateCount = store - oldStore;
        //可用库存
        int enableStore = checkGS.getEnableStore() + updateCount;
        MsGoodsStore goodsStore = new MsGoodsStore();
        goodsStore.setStoreId(storeId);
        goodsStore.setStore(store);
        if (enableStore < 0) {
            goodsStore.setEnableStore(0);
        } else {
            goodsStore.setEnableStore(enableStore);
        }
        goodsStore.setOperateType((byte) 0);//更新默认是入库
        Timestamp now = new Timestamp(System.currentTimeMillis());
        goodsStore.setIntime(now);
        msGoodsStoreMapper.updateByPrimaryKeySelective(goodsStore);
        result.setStatus(0);
        result.setMsg("更新库存成功");
        result.setData(goodsStore);
        return result;
    }

}

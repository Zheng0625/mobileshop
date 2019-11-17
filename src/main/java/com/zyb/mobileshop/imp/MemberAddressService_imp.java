package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsMemberAddressMapper;
import com.zyb.mobileshop.dao.MsMemberMapper;
import com.zyb.mobileshop.entity.MsMember;
import com.zyb.mobileshop.entity.MsMemberAddress;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MemberAddressService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
/**报错：A component required a bean of type 'com.zyb.mobileshop.service.XXX' that could not be found.*/
public class MemberAddressService_imp implements MemberAddressService {

    @Resource
    private MsMemberAddressMapper msMemberAddressMapper;
    @Resource
    private MsMemberMapper msMemberMapper;

    @Transactional
    @Override
    //新增会员地址信息
    public Result addAddress(int memberId, String provice, String city, String region, String addr, String mobile, String receiver) {
        Result result = new Result();
        MsMember msMember = msMemberMapper.findById(memberId);
        if (msMember == null) {
            result.setStatus(-1);
            result.setMsg("此用户不存在");
            return result;
        }
        MsMemberAddress msMemberAddress = new MsMemberAddress();
        msMemberAddress.setMemberId(memberId);
        msMemberAddress.setProvince(provice);
        msMemberAddress.setCity(city);
        msMemberAddress.setRegion(region);
        msMemberAddress.setAddr(addr);
        msMemberAddress.setMobile(mobile);
        msMemberAddress.setReceiver(receiver);
        msMemberAddress.setCreatime(null);
        msMemberAddress.setModifytime(null);
        msMemberAddressMapper.insert(msMemberAddress);
        result.setStatus(0);
        result.setMsg("会员新增地址成功");
        result.setData(msMemberAddress);
        return result;
    }

    @Override
    //根据会员id加载会员地址信息（关联查询）
    public Result loadAddressesByMemberId(int memberId) {
        Result result = new Result();
        List<MsMemberAddress> list = msMemberAddressMapper.findUnion(memberId);
        //判断是否有会员信息
        if (list.isEmpty()) {
            result.setStatus(-1);
            result.setMsg("此会员暂无地址信息");
            return result;
        }
        result.setStatus(0);
        result.setMsg("会员地址信息查询成功");
        result.setData(list);
        return result;
    }

    @Override
    //根据addressId加载地址信息
    public Result loadAddressById(int addressId) {
        Result result = new Result();
        MsMemberAddress msMemberAddress = msMemberAddressMapper.findById(addressId);
        if (msMemberAddress == null) {
            result.setStatus(-1);
            result.setMsg("此会员地址不存在");
            return result;
        }
        result.setStatus(0);
        result.setMsg("会员地址加载成功");
        result.setData(msMemberAddress);
        return result;
    }

    @Transactional
    @Override
    //根据addressId更新地址信息
    public Result updateAddress(int addressId, String provice, String city, String region, String addr, String mobile, String receiver) {
        Result result = new Result();
        MsMemberAddress msMemberAds = msMemberAddressMapper.findById(addressId);
        if (msMemberAds == null) {
            result.setStatus(-1);
            result.setMsg("此会员地址不存在");
            return result;
        }
        MsMemberAddress msMemberAddress = new MsMemberAddress();
        msMemberAddress.setAddressId(addressId);
        msMemberAddress.setProvince(provice);
        msMemberAddress.setCity(city);
        msMemberAddress.setRegion(region);
        msMemberAddress.setAddr(addr);
        msMemberAddress.setMobile(mobile);
        msMemberAddress.setReceiver(receiver);
        msMemberAddress.setModifytime(null);
        msMemberAddressMapper.dynamicUpdate(msMemberAddress);
        result.setStatus(0);
        result.setMsg("会员地址更新成功");
        result.setData(msMemberAddress);
        return result;
    }

    @Transactional
    @Override
    //根据addressId删除
    public Result deleteAddressById(int addressId) {
        Result result = new Result();
        MsMemberAddress msMemberAds = msMemberAddressMapper.findById(addressId);
        if (msMemberAds == null) {
            result.setStatus(-1);
            result.setMsg("此会员地址不存在");
            return result;
        }
        msMemberAddressMapper.deleteByPrimaryKey(addressId);
        result.setStatus(0);
        result.setMsg("会员地址删除成功");
        return result;
    }

}

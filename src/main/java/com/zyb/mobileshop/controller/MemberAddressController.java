package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MemberAddressService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/member_address")
public class MemberAddressController {
    @Resource
    private MemberAddressService memberAddressService;

    @RequestMapping("/add")
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    //新增会员地址信息
    public Result memAddressAdd(Integer memberId, String provice, String city, String region, String addr, String mobile, String receiver){
        Result result = memberAddressService.addAddress(memberId, provice, city, region, addr, mobile, receiver);
        return result;
    }

    @RequestMapping(value="/member/{memberId}",method= RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    //根据会员id加载会员地址信息（关联查询）
    public Result loadByMemberId(@PathVariable("memberId") int memberId) {
        /**不 加 @PathVariable("memberId")
         * 报 错 （ 下 同 ）java.lang.IllegalStateException: Optional int parameter 'memberId' is present but cannot be translated into a null value due to being declared as a primitive type.
         * Consider declaring it as object wrapper for the corresponding primitive type.*/
        Result result = memberAddressService.loadAddressesByMemberId(memberId);
        return result;
    }

    @RequestMapping(value="/address/{addressId}",method=RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    //根据addressId加载地址信息
    public Result loadById(@PathVariable("addressId") int addressId){
        Result result = memberAddressService.loadAddressById(addressId);
        return result;
    }

    @RequestMapping(value="/{addressId}",method=RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    //根据addressId更新地址信息
    public Result updateAddress(@PathVariable("addressId") int addressId, String provice, String city, String region, String addr, String mobile, String receiver) {
        Result result = memberAddressService.updateAddress(addressId,provice,city, region, addr, mobile, receiver);
        return result;
    }

    @RequestMapping(value="/{addressId}",method=RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value="测试Swagger")
    //根据addressId删除
    public Result deleteById(@PathVariable("addressId") int addressId) {
        Result result = memberAddressService.deleteAddressById(addressId);
        return result;
    }
}

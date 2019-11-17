package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsOrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/order")
public class MsOrderController {
	@Resource
	private MsOrderService msOrderService;
	//新增
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result add(int memberId, int addressId, int paytypeId, double carriage){
		Result result= msOrderService.addOrder(memberId, addressId,paytypeId,carriage);
		return result;
	}
	//根据id加载
	@RequestMapping(value="/{orderId}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result loadById(@PathVariable("orderId") int orderId){
		Result result= msOrderService.loadOrderById(orderId);
		return result;
	}
	//根据会员id加载（订单表、订单商品表、商品表关联查询）
	@RequestMapping(value="/member/{memberId}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result loadByMemberId(@PathVariable("memberId") int memberId){
		Result result= msOrderService.loadOrderByMemberId(memberId);
		return result;
	}
	//更新订单状态（取消订单）
	@RequestMapping(value="/{orderId}",method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result updateStatusById(@PathVariable("orderId") int orderId){
		Result result= msOrderService.updateOrderStatus(orderId);
		return result;
	}
}

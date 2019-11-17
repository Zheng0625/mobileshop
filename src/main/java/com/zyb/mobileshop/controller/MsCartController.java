package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsCartService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/cart")
public class MsCartController {
	@Resource
	private MsCartService msCartService;
	//新增
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result add(int memberId, int goodsId, int goodsNum){
		Result result= msCartService.addCart(memberId, goodsId, goodsNum);
		return result;
	}

	//根据会员id加载
	@RequestMapping(value="/member/{memberId}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result loadByMemberId(@PathVariable("memberId") int memberId){
		Result result= msCartService.loadCartByMemberId(memberId);
		return result;
	}
	//根据会员id加载选中的商品
	@RequestMapping(value="/choose/member/{memberId}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result loadChooseByMemberId(@PathVariable("memberId") int memberId){
		Result result= msCartService.loadChooseCartByMemberId(memberId);
		return result;
	}
	//根据id更新
	@RequestMapping(value="/{cartId}",method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result updateById(@PathVariable("cartId") int cartId,int goodsNum,int choose){
		Result result= msCartService.updateCart(cartId, goodsNum, choose);
		return result;
	}
	//根据id更新商品数量
	@RequestMapping(value="/num/{cartId}",method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result updateGoodsNum(@PathVariable("cartId") int cartId,int goodsNum){
		Result result= msCartService.updateGoodsNum(cartId, goodsNum);
		return result;
	}
	//根据id更新状态
	@RequestMapping(value="/choose/{cartId}",method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result updateChoose(@PathVariable("cartId") int cartId,int choose){
		Result result= msCartService.updateChoose(cartId, choose);
		return result;
	}
	//根据id删除
	@RequestMapping(value="/{cartId}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result deleteById(@PathVariable("cartId") int cartId){
		Result result= msCartService.deleteCartById(cartId);
		return result;
	}
}

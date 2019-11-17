package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsCommentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/comment")
public class MsGoodsCommentController {
	@Resource
	private MsGoodsCommentService msGoodsCommentService;
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result add(int orderId,int goodsId,int score,String content,int isopen){
		Result result= msGoodsCommentService.addComment(orderId, goodsId, score, content, isopen);
		return result;
	}
	@RequestMapping(value="/goods/{goodsId}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result loadByGoodsId(@PathVariable("goodsId") int goodsId){
		Result result= msGoodsCommentService.loadCommentByGoodsId(goodsId);
		return result;
	}
	@RequestMapping(value="/member/{memberId}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result loadByMemberId(@PathVariable("memberId") int memberId){
		Result result= msGoodsCommentService.loadCommentByMemberId(memberId);
		return result;
	}
}

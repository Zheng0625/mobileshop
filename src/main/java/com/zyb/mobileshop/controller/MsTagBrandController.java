package com.zyb.mobileshop.controller;

import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsTagBrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/tag_brand")
public class MsTagBrandController {
	@Resource
	private MsTagBrandService msTagBrandService;
	
	//新增标签品牌关联信息
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result add(int tagId, int brandId){
		Result result= msTagBrandService.add(tagId, brandId);
		return result;
	}
	//根据标签id加载品牌
	@RequestMapping(value="/tag/{tagId}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result loadByTagId(@PathVariable("tagId") int tagId){
		Result result= msTagBrandService.loadByTagId(tagId);
		return result;		
	}
	//根据id更新sort
	@RequestMapping(value="/sort/{id}",method=RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result updateSortById(@PathVariable("id") int id,int sort){
		Result result= msTagBrandService.updateSortById(id, sort);
		return result;
	}
	//根据id删除
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation(value="测试Swagger")
	public Result deleteById(@PathVariable("id") int id){
		Result result= msTagBrandService.deleteById(id);
		return result;
	}
}

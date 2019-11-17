package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.MsBrandMapper;
import com.zyb.mobileshop.dao.MsTagBrandRefMapper;
import com.zyb.mobileshop.dao.MsTagMapper;
import com.zyb.mobileshop.entity.MsBrand;
import com.zyb.mobileshop.entity.MsTag;
import com.zyb.mobileshop.entity.MsTagBrandRef;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsTagBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class MsMsTagBrandService_imp implements MsTagBrandService {
	@Resource
	private MsTagBrandRefMapper tagBrandDao;
	@Resource
	private MsTagMapper tagDao;
	@Resource
	private MsBrandMapper brandDao;

	//新增标签品牌关联信息
	public Result add(int tagId, int brandId) {
		Result result=new Result();
		MsTag tag=tagDao.selectByPrimaryKey(tagId);
		//判断标签是否存在
		if(tag==null){
			result.setStatus(1);
			result.setMsg("此标签不存在");
			return result;
		}
		//判断是否为品牌标签
		if(tag.getType()!=1){
			result.setStatus(1);
			result.setMsg("此标签不是品牌标签");
			return result;
		}
		List<MsTagBrandRef> tbs=tagBrandDao.findUnionByTagId(tagId);
		//判断标签下的品牌数量
		if(tbs.size()>=tag.getCount()){
			result.setStatus(1);
			result.setMsg("此标签下品牌数量已满");
			return result;
		}
		MsBrand brand=brandDao.selectByPrimaryKey(brandId);
		//判断品牌是否存在
		if(brand==null){
			result.setStatus(1);
			result.setMsg("不存在此品牌");
			return result;
		}
		//判断品牌是否可用
		if(brand.getDisabled()!=0){
			result.setStatus(1);
			result.setMsg("此品牌不可用");
			return result;
		}
		//判断是否已经关联过
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("tag_id", tagId);
		map.put("brand_id", brandId);
		MsTagBrandRef checkTB=tagBrandDao.findRepeat(map);
		if(checkTB!=null){
			result.setStatus(1);
			result.setMsg("此标签已经关联过此品牌");
			return result;
		}
		MsTagBrandRef tagBrand=new MsTagBrandRef();
		tagBrand.setId(null);
		tagBrand.setTagId(tagId);
		tagBrand.setBrandId(brandId);
		tagBrand.setSort((short) 0);//默认为0
		tagBrand.setCreatime(null);
		tagBrand.setModifytime(null);
		tagBrandDao.insert(tagBrand);
		result.setStatus(0);
		result.setMsg("添加标签品牌关联信息成功");
		result.setData(tagBrand);
		return result;
	}

	//根据标签id加载品牌
	public Result loadByTagId(int tagId) {
		Result result=new Result();
		MsTag tag=tagDao.selectByPrimaryKey(tagId);
		//判断标签是否存在
		if(tag==null){
			result.setStatus(1);
			result.setMsg("此标签不存在");
			return result;
		}
		//判断是否为品牌标签
		if(tag.getType()!=1){
			result.setStatus(1);
			result.setMsg("此标签不是品牌标签");
			return result;
		}
		List<MsTagBrandRef> tbs=tagBrandDao.findUnionByTagId(tagId);
		if(tbs.isEmpty()){
			result.setStatus(1);
			result.setMsg("此标签下没有品牌");
			result.setData(tbs);
			return result;
		}
		result.setStatus(0);
		result.setMsg("加载标签下的品牌成功");
		result.setData(tbs);
		return result;
	}
	
	//根据id更新sort
	public Result updateSortById(int id, int sort) {
		Result result=new Result();
		MsTagBrandRef checkTB=tagBrandDao.selectByPrimaryKey(id);
		if(checkTB==null){
			result.setStatus(1);
			result.setMsg("此标签品牌关联信息不存在");
			return result;
		}
		MsTagBrandRef tagBrand=new MsTagBrandRef();
		tagBrand.setId(id);
		tagBrand.setSort((short) sort);
		Timestamp now=new Timestamp(System.currentTimeMillis());
		tagBrand.setModifytime(now);
		tagBrandDao.updateByPrimaryKeySelective(tagBrand);
		result.setStatus(0);
		result.setMsg("更新排序成功");
		return result;
	}
		
	//根据id删除
	public Result deleteById(int id) {
		Result result=new Result();
		MsTagBrandRef checkTB=tagBrandDao.selectByPrimaryKey(id);
		if(checkTB==null){
			result.setStatus(1);
			result.setMsg("此标签品牌关联信息不存在");
			return result;
		}
		tagBrandDao.deleteByPrimaryKey(id);
		result.setStatus(0);
		result.setMsg("删除标签品牌关联信息成功");
		return result;
	}

	

}

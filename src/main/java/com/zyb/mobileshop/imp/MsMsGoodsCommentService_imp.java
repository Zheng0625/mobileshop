package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.*;
import com.zyb.mobileshop.entity.*;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsGoodsCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class MsMsGoodsCommentService_imp implements MsGoodsCommentService {
	@Resource
	private MsGoodsCommentMapper goodsCommentDao;
	@Resource
	private MsOrderMapper orderDao;
	@Resource
	private MsOrderGoodsMapper OrderGoodsDao;
	@Resource
	private MsGoodsMapper goodsDao;
	@Resource
	private MsMemberMapper memberDao;
	
	public Result addComment(int orderId, int goodsId, int score, String content, int isopen) {
		Result result=new Result();
		MsOrder order=orderDao.selectByPrimaryKey(orderId);
		if(order==null){
			result.setStatus(1);
			result.setMsg("不存在此订单");
			return result;
		}
		MsGoods goods=goodsDao.selectByPrimaryKey(goodsId);
		if(goods==null){
			result.setStatus(1);
			result.setMsg("不存在此商品");
			return result;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("order_id", orderId);
		map.put("goods_id", goodsId);
		MsOrderGoods og=OrderGoodsDao.findRepeat(map);
		if(og==null){
			result.setStatus(1);
			result.setMsg("此订单不存在该商品");
			return result;
		}
		int memberId=order.getMemberId();
		MsGoodsComment goodsComment=new MsGoodsComment();
		goodsComment.setCommentId(null);
		goodsComment.setOrderId(orderId);
		goodsComment.setGoodsId(goodsId);
		goodsComment.setMemberId(memberId);
		goodsComment.setScore((byte) score);
		goodsComment.setContent(content);
		goodsComment.setIsopen((byte) isopen);
		goodsComment.setCreatime(null);
		goodsCommentDao.insert(goodsComment);
		result.setStatus(0);
		result.setMsg("提交评价成功");
		return result;
	}

	public Result loadCommentByGoodsId(int goodsId) {
		Result result=new Result();
		MsGoods goods=goodsDao.selectByPrimaryKey(goodsId);
		if(goods==null){
			result.setStatus(1);
			result.setMsg("不存在此商品");
			return result;
		}
		List<MsGoodsComment> gcs=goodsCommentDao.findUnionByGoodsId(goodsId);
		result.setStatus(0);
		result.setMsg("加载评论成功");
		result.setData(gcs);
		return result;
	}

	public Result loadCommentByMemberId(int memberId) {
		Result result=new Result();
		MsMember member=memberDao.findById(memberId);
		if(member==null){
			result.setStatus(1);
			result.setMsg("不存在此会员");
			return result;
		}
		List<MsGoodsComment> gcs=goodsCommentDao.findUnionByMemberId(memberId);
		result.setStatus(0);
		result.setMsg("加载评论成功");
		result.setData(gcs);
		return result;
	}

}

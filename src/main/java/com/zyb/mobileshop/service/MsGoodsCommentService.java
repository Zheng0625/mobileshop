package com.zyb.mobileshop.service;

import com.zyb.mobileshop.entity.result.Result;

public interface MsGoodsCommentService {
	public Result addComment(int orderId, int goodsId, int score, String content, int isopen);
	public Result loadCommentByGoodsId(int goodsId);
	public Result loadCommentByMemberId(int memberId);
}

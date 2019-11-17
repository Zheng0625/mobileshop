package com.zyb.mobileshop.imp;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.zyb.mobileshop.dao.MsCartMapper;
import com.zyb.mobileshop.dao.MsGoodsMapper;
import com.zyb.mobileshop.dao.MsMemberMapper;
import com.zyb.mobileshop.entity.MsCart;
import com.zyb.mobileshop.entity.MsGoods;
import com.zyb.mobileshop.entity.MsMember;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsCartService;
import org.springframework.stereotype.Service;
@Service
public class MsCartService_imp implements MsCartService {
	@Resource
	private MsCartMapper cartDao;
	@Resource
	private MsGoodsMapper goodsDao;
	@Resource
	private MsMemberMapper memberDao;
	//新增
	public Result addCart(int memberId, int goodsId, int goodsNum) {
		Result result=new Result();
		MsGoods goods=goodsDao.selectByPrimaryKey(goodsId);
		if(goods==null){
			result.setStatus(1);
			result.setMsg("不存在此商品");
			return result;
		}
		if(goods.getMktEnable()==1){
			result.setStatus(1);
			result.setMsg("此商品已下架");
			return result;
		}
		double price=goods.getPrice();
		MsCart cart1=new MsCart();
		cart1.setMemberId(memberId);
		cart1.setGoodsId(goodsId);
		List<MsCart> carts=cartDao.dynamicFind(cart1);
		//购物车中没有此商品
		if(carts.isEmpty()){
			MsCart cart=new MsCart();
			cart.setCartId(null);
			cart.setMemberId(memberId);
			cart.setGoodsId(goodsId);
			cart.setGoodsNum(goodsNum);
			cart.setChoose((byte) 1);//默认为“没选择”
			cart.setAmount(goodsNum*price);
			cart.setCreatime(null);
			cart.setModifytime(null);
			cartDao.insert(cart);
			result.setStatus(0);
			result.setMsg("添加到购物车成功");
			result.setData(cart);
			return result;
		}
		//购物车中已包含此商品
		MsCart updateCart=new MsCart();
		for(MsCart checkCart:carts){
			int cartId=checkCart.getCartId();
			updateCart.setCartId(cartId);
			int newGoodsNum=checkCart.getGoodsNum()+goodsNum;
			updateCart.setGoodsNum(newGoodsNum);
			updateCart.setAmount(newGoodsNum*price);
			Timestamp now=new Timestamp(System.currentTimeMillis());
			updateCart.setModifytime(now);
			cartDao.updateByPrimaryKeySelective(updateCart);
			result.setData(cartDao.selectByPrimaryKey(cartId));
		}
		result.setStatus(0);
		result.setMsg("添加到购物车成功");
		return result;
	}
	//根据会员id加载
	public Result loadCartByMemberId(int memberId) {
		Result result=new Result();
		MsMember member=memberDao.findById(memberId);
		if(member==null){
			result.setStatus(1);
			result.setMsg("不存在此会员");
			return result;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("member_id", memberId);
		List<MsCart> carts=cartDao.findUnionByMemberId(map);
		result.setStatus(0);
		result.setMsg("加载购物车成功");
		result.setData(carts);
		return result;
	}
	//根据会员id加载选中的记录
	public Result loadChooseCartByMemberId(int memberId) {
		Result result=new Result();
		MsMember member=memberDao.findById(memberId);
		if(member==null){
			result.setStatus(1);
			result.setMsg("不存在此会员");
			return result;
		}
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("member_id", memberId);
		map.put("choose", 0);
		List<MsCart> carts=cartDao.findUnionByMemberId(map);
		result.setStatus(0);
		result.setMsg("加载选中的商品成功");
		result.setData(carts);
		return result;
	}
	//根据id更新
	public Result updateCart(int cartId, int goodsNum, int choose) {
		Result result=new Result();
		MsCart checkCart=cartDao.selectByPrimaryKey(cartId);
		if(checkCart==null){
			result.setStatus(1);
			result.setMsg("没有此条记录");
			return result;
		}
		MsGoods goods=goodsDao.selectByPrimaryKey(checkCart.getGoodsId());
		if(goods==null){
			result.setStatus(1);
			result.setMsg("不存在此商品");
			return result;
		}
		if(goods.getMktEnable()==1){
			result.setStatus(1);
			result.setMsg("此商品已下架");
			return result;
		}
		double price=goods.getPrice();
		MsCart cart=new MsCart();
		cart.setCartId(cartId);
		cart.setGoodsNum(goodsNum);
		cart.setAmount(goodsNum*price);
		cart.setChoose((byte) choose);
		Timestamp now=new Timestamp(System.currentTimeMillis());
		cart.setModifytime(now);
		cartDao.updateByPrimaryKeySelective(cart);
		result.setStatus(0);
		result.setMsg("更新购物车记录成功");
		return result;
	}
	//根据id更新数量
	public Result updateGoodsNum(int cartId, int goodsNum) {
		Result result=new Result();
		MsCart checkCart=cartDao.selectByPrimaryKey(cartId);
		if(checkCart==null){
			result.setStatus(1);
			result.setMsg("没有此条记录");
			return result;
		}
		MsGoods goods=goodsDao.selectByPrimaryKey(checkCart.getGoodsId());
		if(goods==null){
			result.setStatus(1);
			result.setMsg("不存在此商品");
			return result;
		}
		if(goods.getMktEnable()==1){
			result.setStatus(1);
			result.setMsg("此商品已下架");
			return result;
		}
		double price=goods.getPrice();
		MsCart cart=new MsCart();
		cart.setCartId(cartId);
		cart.setGoodsNum(goodsNum);
		cart.setAmount(goodsNum*price);
		Timestamp now=new Timestamp(System.currentTimeMillis());
		cart.setModifytime(now);
		cartDao.updateByPrimaryKeySelective(cart);
		result.setStatus(0);
		result.setMsg("更新商品数量成功");
		return result;
	}
	//根据id更新状态
	public Result updateChoose(int cartId, int choose) {
		Result result=new Result();
		MsCart checkCart=cartDao.selectByPrimaryKey(cartId);
		if(checkCart==null){
			result.setStatus(1);
			result.setMsg("没有此条记录");
			return result;
		}
		MsCart cart=new MsCart();
		cart.setCartId(cartId);
		cart.setChoose((byte) choose);
		Timestamp now=new Timestamp(System.currentTimeMillis());
		cart.setModifytime(now);
		cartDao.updateByPrimaryKeySelective(cart);
		result.setStatus(0);
		result.setMsg("更新商品状态成功");
		return result;
	}
	//根据id删除
	public Result deleteCartById(int cartId) {
		Result result=new Result();
		MsCart checkCart=cartDao.selectByPrimaryKey(cartId);
		if(checkCart==null){
			result.setStatus(1);
			result.setMsg("没有此条记录");
			return result;
		}
		cartDao.deleteByPrimaryKey(cartId);
		result.setStatus(0);
		result.setMsg("删除购物车记录成功");
		return result;
	}
	

}

package com.zyb.mobileshop.imp;

import com.zyb.mobileshop.dao.*;
import com.zyb.mobileshop.entity.*;
import com.zyb.mobileshop.entity.brief.BriefOrderLog;
import com.zyb.mobileshop.entity.result.Result;
import com.zyb.mobileshop.service.MsOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
@Service
public class MsMsOrderService_imp implements MsOrderService {
	@Resource
	private MsOrderMapper orderDao;
	@Resource
	private MsMemberMapper memberDao;
	@Resource
	private MsCartMapper cartDao;
	@Resource
	private MsOrderGoodsMapper orderGoodsDao;
	@Resource
	private MsGoodsMapper goodsDao;
	@Resource
	private MsOrderLogMapper orderLogDao;
	@Resource
	private MsMemberAddressMapper memberAddressDao;
	@Resource
	private MsPaymentMapper paymentDao;
	@Resource
	private MsLogiMapper logiDao;
	@Resource
	private MsShipMapper shipDao;
	@Resource
	private MsPaytypeMapper payTypeDao;
	//创建订单
	public Result addOrder(int memberId, int addressId, int paytypeId, double carriage) {
		Result result=new Result();
		MsMember member=memberDao.findById(memberId);
		if(member==null){
			result.setStatus(1);
			result.setMsg("不存在此会员");
			return result;
		}
		//购物车中选中的商品
		MsCart findCart=new MsCart();
		findCart.setMemberId(memberId);
		findCart.setChoose((byte) 0);
		List<MsCart> carts=cartDao.dynamicFind(findCart);
		if(carts.isEmpty()){
			result.setStatus(1);
			result.setMsg("没有选中的商品");
			return result;
		}
		//判断addressId是否关联memberId
		MsMemberAddress ma=memberAddressDao.findById(addressId);
		if(ma.getMemberId()!=memberId){
			result.setStatus(1);
			result.setMsg("不是此会员的地址");
			return result;
		}
		double totalAmount=carriage;
		for(MsCart cart:carts){
			double amount=cart.getAmount();
			totalAmount+=amount;
		}
		//新增订单
		MsOrder order=new MsOrder();
		order.setOrderId(null);
		//订单编号采用UUID生成
		order.setSn(UUID.randomUUID().toString().replaceAll("-", ""));
		order.setMemberId(memberId);
		order.setStatus(0);//订单状态,0:创建
		//创建payment
		MsPayment payment=new MsPayment();
		payment.setPaymentId(null);
		Random r=new Random();
		Long time=new Date().getTime();
		payment.setSn(Integer.toString(memberId)+time+r.nextInt(100));
		payment.setPaytypeId(paytypeId);
		payment.setAmount(totalAmount);
		payment.setStatus((short) 0);//支付状态，0：创建
		payment.setPaytime(null);
		payment.setRemark("");
		paymentDao.insert(payment);
		//设置支付id
		order.setPaymentId(payment.getPaymentId());
		//创建logi
		MsLogi logi=new MsLogi();
		logi.setLogiId(null);
		logi.setShipId(0);//还未关联货运公司id
		logi.setSn("");
		logi.setCarriage(carriage);
		logi.setSender("");
		logi.setStatus(0);//物流状态，0：创建
		logi.setCreatime(null);
		logi.setModifytime(null);
		logiDao.insert(logi);
		//设置物流id
		order.setLogiId(logi.getLogiId());
		order.setTotalAmount(totalAmount);
		order.setAddressId(addressId);
		order.setCreatime(null);
		order.setModifytime(null);
		orderDao.insert(order);
		int orderId=order.getOrderId();
		//在订单商品表中增加数据
		for(MsCart cart1:carts){
			MsOrderGoods orderGoods=new MsOrderGoods();
			orderGoods.setId(null);
			orderGoods.setOrderId(orderId);
			int goodsId=cart1.getGoodsId();
			orderGoods.setGoodsId(goodsId);
			orderGoods.setGoodsNum(cart1.getGoodsNum());
			MsGoods goods=goodsDao.selectByPrimaryKey(goodsId);
			orderGoods.setPrice(goods.getPrice());
			orderGoodsDao.insert(orderGoods);
		}
		//将购物车中的记录删除
		for(MsCart cart2:carts){
			cartDao.deleteByPrimaryKey(cart2.getCartId());
		}
		//在订单日志表中记录
		MsOrderLog orderLog=new MsOrderLog();
		orderLog.setLogId(null);
		orderLog.setOrderId(orderId);
		orderLog.setStatus(order.getStatus());
		orderLog.setTime(order.getCreatime());
		orderLogDao.insert(orderLog);
		result.setStatus(0);
		result.setMsg("新建订单成功");
		result.setData(order);
		return result;
	}
	
	//根据id加载
	public Result loadOrderById(int orderId) {
		Result result=new Result();
		MsOrder order=orderDao.selectByPrimaryKey(orderId);
		if(order==null){
			result.setStatus(1);
			result.setMsg("此订单不存在");
			return result;
		}
		//获取收货地址
		int addressId=order.getAddressId();
		MsMemberAddress ma=memberAddressDao.findById(addressId);
		String memberAddress=ma.getReceiver()+","+ma.getMobile()+","+ma.getProvince()
		+ma.getCity()+ma.getRegion()+ma.getAddr();
		//装载参数
		OrderResult orderResult=new OrderResult();
		orderResult.setOrder_id(orderId);//订单编号
		orderResult.setOrder_sn(order.getSn());//订单号
		orderResult.setOrder_status(order.getStatus());//订单状态
		orderResult.setMember_address(memberAddress);//收货人地址信息
		//获取物流
		int logiId=order.getLogiId();
		if(logiId!=0){
			MsLogi logi=logiDao.selectByPrimaryKey(logiId);
			//获取货运公司
			int shipId=logi.getShipId();
			MsShip ship=shipDao.selectByPrimaryKey(shipId);
			orderResult.setShip_name(ship.getName());//货运公司名字
			orderResult.setLogi_sn(logi.getSn());//物流编号
			orderResult.setLogi_status(logi.getStatus());//物流状态
			orderResult.setCarriage(logi.getCarriage());//运费
		}else{
			orderResult.setShip_name("");
			orderResult.setLogi_sn("");
			orderResult.setLogi_status(null);
			orderResult.setCarriage(null);
		}
		//获取支付方式
		int paymentId=order.getPaymentId();
		if(paymentId!=0){
			MsPayment payment=paymentDao.selectByPrimaryKey(paymentId);
			int payTypeId=payment.getPaytypeId();
			MsPaytype payType=payTypeDao.selectByPrimaryKey(payTypeId);
			orderResult.setPaytype_name(payType.getName());//支付类型的名称
		}else{
			orderResult.setPaytype_name("");
		}
		//获取订单商品集合
		List<MsOrderGoods> ogs=orderGoodsDao.findUnionByOrderId(orderId);
		orderResult.setOgs(ogs);//商品集合
		//获取日志集合
		List<BriefOrderLog> bols=orderLogDao.findByOrderId(orderId);
		orderResult.setBols(bols);//订单日志
		result.setStatus(0);
		result.setMsg("加载订单详情成功");
		result.setData(orderResult);
		return result;
	}
	
	//根据会员id加载（“我的订单”页面，订单表、订单商品表、商品表关联查询）
	public Result loadOrderByMemberId(int memberId) {
		Result result=new Result();
		MsMember member=memberDao.findById(memberId);
		if(member==null){
			result.setStatus(1);
			result.setMsg("不存在此会员");
			return result;
		}
		List<MsOrder> orders=orderDao.findUnionByMemberId(memberId);
		result.setStatus(0);
		result.setMsg("加载订单成功");
		result.setData(orders);
		return result;
	}

	//更新订单状态（取消订单）
	public Result updateOrderStatus(int orderId) {
		Result result=new Result();
		MsOrder checkOrder=orderDao.selectByPrimaryKey(orderId);
		if(checkOrder==null){
			result.setStatus(1);
			result.setMsg("不存在此订单");
			return result;
		}
		if(checkOrder.getStatus()!=0){
			result.setStatus(1);
			result.setMsg("此订单不能取消");
			return result;
		}
		//删除和此订单相关的支付记录
		int paymentId=checkOrder.getPaymentId();
		paymentDao.deleteByPrimaryKey(paymentId);
		//删除和此订单相关的物流记录
		int logiId=checkOrder.getLogiId();
		logiDao.deleteByPrimaryKey(logiId);
		//更新订单状态
		MsOrder order=new MsOrder();
		order.setOrderId(orderId);
		order.setStatus(4);//4:订单取消
		order.setPaymentId(0);//将关联的支付记录更新为0
		order.setLogiId(0);//将关联的物流记录更新为0
		orderDao.updateByPrimaryKeySelective(order);
		//向日志添加一条记录
		MsOrderLog orderLog=new MsOrderLog();
		orderLog.setLogId(null);
		orderLog.setOrderId(orderId);
		orderLog.setStatus(order.getStatus());
		Timestamp now=new Timestamp(System.currentTimeMillis());
		orderLog.setTime(now);
		orderLogDao.insert(orderLog);
		result.setStatus(0);
		result.setMsg("取消订单成功");
		return result;
	}

}

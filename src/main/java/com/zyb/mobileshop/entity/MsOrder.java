package com.zyb.mobileshop.entity;

import com.zyb.mobileshop.entity.brief.BriefLogi;
import com.zyb.mobileshop.entity.brief.BriefOrderLog;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class MsOrder implements Serializable {
    /**
     * 订单编号
     */
    private Integer orderId;

    /**
     * 订单号
     */
    private String sn;

    /**
     * 会员编号
     */
    private Integer memberId;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 支付编号
     */
    private Integer paymentId;

    /**
     * 物流编号
     */
    private Integer logiId;

    /**
     * 总金额
     */
    private Double totalAmount;

    /**
     * 会员收货地址编号
     */
    private Integer addressId;

    /**
     * 创建订单的时间
     */
    private Date creatime;

    /**
     * 修改时间
     */
    private Date modifytime;

    private BriefLogi bl;

    private BriefOrderLog bol;

    public BriefOrderLog getBol() {
        return bol;
    }

    public void setBol(BriefOrderLog bol) {
        this.bol = bol;
    }

    public BriefLogi getBl() {
        return bl;
    }

    public void setBl(BriefLogi bl) {
        this.bl = bl;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getLogiId() {
        return logiId;
    }

    public void setLogiId(Integer logiId) {
        this.logiId = logiId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MsOrder other = (MsOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getSn() == null ? other.getSn() == null : this.getSn().equals(other.getSn()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPaymentId() == null ? other.getPaymentId() == null : this.getPaymentId().equals(other.getPaymentId()))
            && (this.getLogiId() == null ? other.getLogiId() == null : this.getLogiId().equals(other.getLogiId()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getSn() == null) ? 0 : getSn().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPaymentId() == null) ? 0 : getPaymentId().hashCode());
        result = prime * result + ((getLogiId() == null) ? 0 : getLogiId().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getCreatime() == null) ? 0 : getCreatime().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", sn=").append(sn);
        sb.append(", memberId=").append(memberId);
        sb.append(", status=").append(status);
        sb.append(", paymentId=").append(paymentId);
        sb.append(", logiId=").append(logiId);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", addressId=").append(addressId);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
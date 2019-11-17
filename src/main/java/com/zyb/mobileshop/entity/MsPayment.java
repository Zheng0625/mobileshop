package com.zyb.mobileshop.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class MsPayment implements Serializable {
    /**
     * 支付编号
     */
    private Integer paymentId;

    /**
     * 支付号
     */
    private String sn;

    /**
     * 支付类型编号
     */
    private Integer paytypeId;

    /**
     * 金额
     */
    private Double amount;

    /**
     * 支付状态
     */
    private Short status;

    /**
     * 支付时间
            
     */
    private Date paytime;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getPaytypeId() {
        return paytypeId;
    }

    public void setPaytypeId(Integer paytypeId) {
        this.paytypeId = paytypeId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        MsPayment other = (MsPayment) that;
        return (this.getPaymentId() == null ? other.getPaymentId() == null : this.getPaymentId().equals(other.getPaymentId()))
            && (this.getSn() == null ? other.getSn() == null : this.getSn().equals(other.getSn()))
            && (this.getPaytypeId() == null ? other.getPaytypeId() == null : this.getPaytypeId().equals(other.getPaytypeId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaymentId() == null) ? 0 : getPaymentId().hashCode());
        result = prime * result + ((getSn() == null) ? 0 : getSn().hashCode());
        result = prime * result + ((getPaytypeId() == null) ? 0 : getPaytypeId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymentId=").append(paymentId);
        sb.append(", sn=").append(sn);
        sb.append(", paytypeId=").append(paytypeId);
        sb.append(", amount=").append(amount);
        sb.append(", status=").append(status);
        sb.append(", paytime=").append(paytime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
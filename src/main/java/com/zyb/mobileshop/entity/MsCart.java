package com.zyb.mobileshop.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class MsCart implements Serializable {
    /**
     * 购物车编号
     */
    private Integer cartId;

    /**
     * 会员编号
     */
    private Integer memberId;

    /**
     * 商品编号
     */
    private Integer goodsId;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 是否选中
     */
    private Byte choose;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 金额
     */
    private Double amount;

    /**
     * 创建时间
     */
    private Date creatime;

    /**
     * 修改时间
     */
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Byte getChoose() {
        return choose;
    }

    public void setChoose(Byte choose) {
        this.choose = choose;
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
        MsCart other = (MsCart) that;
        return (this.getCartId() == null ? other.getCartId() == null : this.getCartId().equals(other.getCartId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsNum() == null ? other.getGoodsNum() == null : this.getGoodsNum().equals(other.getGoodsNum()))
            && (this.getChoose() == null ? other.getChoose() == null : this.getChoose().equals(other.getChoose()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCartId() == null) ? 0 : getCartId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsNum() == null) ? 0 : getGoodsNum().hashCode());
        result = prime * result + ((getChoose() == null) ? 0 : getChoose().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
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
        sb.append(", cartId=").append(cartId);
        sb.append(", memberId=").append(memberId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsNum=").append(goodsNum);
        sb.append(", choose=").append(choose);
        sb.append(", amount=").append(amount);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
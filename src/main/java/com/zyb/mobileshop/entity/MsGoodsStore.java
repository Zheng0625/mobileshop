package com.zyb.mobileshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsGoodsStore implements Serializable {
    /**
     * 库存编号
     */
    private Integer storeId;

    /**
     * 商品编号
     */
    private Integer goodsId;

    /**
     * 库存数量
     */
    private Integer store;

    /**
     * 可用库存
     */
    private Integer enableStore;

    /**
     * 库存操作类型
     */
    private Byte operateType;

    /**
     * 入库时间
     */
    private Date intime;

    /**
     * 出库时间
     */
    private Date outtime;

    private static final long serialVersionUID = 1L;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getEnableStore() {
        return enableStore;
    }

    public void setEnableStore(Integer enableStore) {
        this.enableStore = enableStore;
    }

    public Byte getOperateType() {
        return operateType;
    }

    public void setOperateType(Byte operateType) {
        this.operateType = operateType;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
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
        MsGoodsStore other = (MsGoodsStore) that;
        return (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getStore() == null ? other.getStore() == null : this.getStore().equals(other.getStore()))
            && (this.getEnableStore() == null ? other.getEnableStore() == null : this.getEnableStore().equals(other.getEnableStore()))
            && (this.getOperateType() == null ? other.getOperateType() == null : this.getOperateType().equals(other.getOperateType()))
            && (this.getIntime() == null ? other.getIntime() == null : this.getIntime().equals(other.getIntime()))
            && (this.getOuttime() == null ? other.getOuttime() == null : this.getOuttime().equals(other.getOuttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getStore() == null) ? 0 : getStore().hashCode());
        result = prime * result + ((getEnableStore() == null) ? 0 : getEnableStore().hashCode());
        result = prime * result + ((getOperateType() == null) ? 0 : getOperateType().hashCode());
        result = prime * result + ((getIntime() == null) ? 0 : getIntime().hashCode());
        result = prime * result + ((getOuttime() == null) ? 0 : getOuttime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storeId=").append(storeId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", store=").append(store);
        sb.append(", enableStore=").append(enableStore);
        sb.append(", operateType=").append(operateType);
        sb.append(", intime=").append(intime);
        sb.append(", outtime=").append(outtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
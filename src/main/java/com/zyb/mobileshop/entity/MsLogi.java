package com.zyb.mobileshop.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class MsLogi implements Serializable {
    /**
     * 物流编号
     */
    private Integer logiId;

    /**
     * 货运公司编号
     */
    private Integer shipId;

    /**
     * 物流单号
     */
    private String sn;

    /**
     * 运费
     */
    private Double carriage;

    /**
     * 送货人
            
     */
    private String sender;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date creatime;

    /**
     * 修改时间
     */
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public Integer getLogiId() {
        return logiId;
    }

    public void setLogiId(Integer logiId) {
        this.logiId = logiId;
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Double getCarriage() {
        return carriage;
    }

    public void setCarriage(Double carriage) {
        this.carriage = carriage;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        MsLogi other = (MsLogi) that;
        return (this.getLogiId() == null ? other.getLogiId() == null : this.getLogiId().equals(other.getLogiId()))
            && (this.getShipId() == null ? other.getShipId() == null : this.getShipId().equals(other.getShipId()))
            && (this.getSn() == null ? other.getSn() == null : this.getSn().equals(other.getSn()))
            && (this.getCarriage() == null ? other.getCarriage() == null : this.getCarriage().equals(other.getCarriage()))
            && (this.getSender() == null ? other.getSender() == null : this.getSender().equals(other.getSender()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogiId() == null) ? 0 : getLogiId().hashCode());
        result = prime * result + ((getShipId() == null) ? 0 : getShipId().hashCode());
        result = prime * result + ((getSn() == null) ? 0 : getSn().hashCode());
        result = prime * result + ((getCarriage() == null) ? 0 : getCarriage().hashCode());
        result = prime * result + ((getSender() == null) ? 0 : getSender().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", logiId=").append(logiId);
        sb.append(", shipId=").append(shipId);
        sb.append(", sn=").append(sn);
        sb.append(", carriage=").append(carriage);
        sb.append(", sender=").append(sender);
        sb.append(", status=").append(status);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
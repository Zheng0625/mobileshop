package com.zyb.mobileshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsGoodsType implements Serializable {
    /**
     * 类型编号
     */
    private Integer typeId;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否可用
     */
    private Byte disabled;

    /**
     * 是否是实体商品
     */
    private Byte isPhysical;

    /**
     * 创建类型的时间
     */
    private Date creatime;

    /**
     * 修改类型的时间
     */
    private Date modifytime;

    /**
     * 类型参数
     */
    private String params;

    private static final long serialVersionUID = 1L;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getDisabled() {
        return disabled;
    }

    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }

    public Byte getIsPhysical() {
        return isPhysical;
    }

    public void setIsPhysical(Byte isPhysical) {
        this.isPhysical = isPhysical;
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

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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
        MsGoodsType other = (MsGoodsType) that;
        return (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDisabled() == null ? other.getDisabled() == null : this.getDisabled().equals(other.getDisabled()))
            && (this.getIsPhysical() == null ? other.getIsPhysical() == null : this.getIsPhysical().equals(other.getIsPhysical()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
            && (this.getParams() == null ? other.getParams() == null : this.getParams().equals(other.getParams()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        result = prime * result + ((getIsPhysical() == null) ? 0 : getIsPhysical().hashCode());
        result = prime * result + ((getCreatime() == null) ? 0 : getCreatime().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getParams() == null) ? 0 : getParams().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeId=").append(typeId);
        sb.append(", name=").append(name);
        sb.append(", disabled=").append(disabled);
        sb.append(", isPhysical=").append(isPhysical);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", params=").append(params);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
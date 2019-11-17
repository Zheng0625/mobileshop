package com.zyb.mobileshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsShip implements Serializable {
    /**
     * 货运公司编号
     */
    private Integer shipId;

    /**
     * 货运公司名称
     */
    private String name;

    /**
     * 公司代码
     */
    private String code;

    /**
     * 创建时间
     */
    private Date creatime;

    /**
     * 修改时间
            
     */
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        MsShip other = (MsShip) that;
        return (this.getShipId() == null ? other.getShipId() == null : this.getShipId().equals(other.getShipId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShipId() == null) ? 0 : getShipId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
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
        sb.append(", shipId=").append(shipId);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.zyb.mobileshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsPaytype implements Serializable {
    /**
     * 支付类型编号
     */
    private Integer paytypeId;

    /**
     * 支付类型名称
     */
    private String name;

    /**
     * 创建支付类型时间
     */
    private Date creatime;

    /**
     * 修改时间
     */
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public Integer getPaytypeId() {
        return paytypeId;
    }

    public void setPaytypeId(Integer paytypeId) {
        this.paytypeId = paytypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        MsPaytype other = (MsPaytype) that;
        return (this.getPaytypeId() == null ? other.getPaytypeId() == null : this.getPaytypeId().equals(other.getPaytypeId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaytypeId() == null) ? 0 : getPaytypeId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
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
        sb.append(", paytypeId=").append(paytypeId);
        sb.append(", name=").append(name);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
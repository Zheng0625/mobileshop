package com.zyb.mobileshop.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class MsPaytypeWithBLOBs extends MsPaytype implements Serializable {
    /**
     * 配置
     */
    private String config;

    /**
     * 支付类型描述
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        MsPaytypeWithBLOBs other = (MsPaytypeWithBLOBs) that;
        return (this.getPaytypeId() == null ? other.getPaytypeId() == null : this.getPaytypeId().equals(other.getPaytypeId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
            && (this.getConfig() == null ? other.getConfig() == null : this.getConfig().equals(other.getConfig()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPaytypeId() == null) ? 0 : getPaytypeId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreatime() == null) ? 0 : getCreatime().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getConfig() == null) ? 0 : getConfig().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", config=").append(config);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
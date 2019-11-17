package com.zyb.mobileshop.entity;

import com.zyb.mobileshop.entity.brief.BriefBrand;
import com.zyb.mobileshop.entity.brief.BriefGoodsType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsTypeBrand implements Serializable {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 类型编号
     */
    private Integer typeId;

    /**
     * 品牌编号
     */
    private Integer brandId;

    /**
     * 创建时间
     */
    private Date creatime;

    /**
     * 修改时间
     */
    private Date modifytime;

    private BriefGoodsType briefGoodsType;
    private BriefBrand briefBrand;

    public BriefBrand getBriefBrand() {
        return briefBrand;
    }

    public void setBriefBrand(BriefBrand briefBrand) {
        this.briefBrand = briefBrand;
    }

    public BriefGoodsType getBriefGoodsType() {
        return briefGoodsType;
    }

    public void setBriefGoodsType(BriefGoodsType briefGoodsType) {
        this.briefGoodsType = briefGoodsType;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
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
        MsTypeBrand other = (MsTypeBrand) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", typeId=").append(typeId);
        sb.append(", brandId=").append(brandId);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
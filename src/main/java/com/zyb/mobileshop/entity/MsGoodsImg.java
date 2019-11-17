package com.zyb.mobileshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsGoodsImg implements Serializable {
    /**
     * 商品图片编号
     */
    private Integer imgId;

    /**
     * 商品编号
     */
    private Integer goodsId;

    /**
     * 缩略图
            
     */
    private String thumbnail;

    /**
     * 大图
     */
    private String big;

    /**
     * 小图
     */
    private String small;

    /**
     * 原图
     */
    private String original;

    /**
     * 是否为主图
     */
    private Short isdefault;

    /**
     * 创建时间
            
     */
    private Date creatime;

    /**
     * 修改时间
     */
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public Short getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Short isdefault) {
        this.isdefault = isdefault;
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
        MsGoodsImg other = (MsGoodsImg) that;
        return (this.getImgId() == null ? other.getImgId() == null : this.getImgId().equals(other.getImgId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getThumbnail() == null ? other.getThumbnail() == null : this.getThumbnail().equals(other.getThumbnail()))
            && (this.getBig() == null ? other.getBig() == null : this.getBig().equals(other.getBig()))
            && (this.getSmall() == null ? other.getSmall() == null : this.getSmall().equals(other.getSmall()))
            && (this.getOriginal() == null ? other.getOriginal() == null : this.getOriginal().equals(other.getOriginal()))
            && (this.getIsdefault() == null ? other.getIsdefault() == null : this.getIsdefault().equals(other.getIsdefault()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getImgId() == null) ? 0 : getImgId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        result = prime * result + ((getBig() == null) ? 0 : getBig().hashCode());
        result = prime * result + ((getSmall() == null) ? 0 : getSmall().hashCode());
        result = prime * result + ((getOriginal() == null) ? 0 : getOriginal().hashCode());
        result = prime * result + ((getIsdefault() == null) ? 0 : getIsdefault().hashCode());
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
        sb.append(", imgId=").append(imgId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", big=").append(big);
        sb.append(", small=").append(small);
        sb.append(", original=").append(original);
        sb.append(", isdefault=").append(isdefault);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
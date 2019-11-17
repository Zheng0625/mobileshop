package com.zyb.mobileshop.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class MsGoodsWithBLOBs extends MsGoods implements Serializable {
    /**
     * 描述
     */
    private String description;

    /**
     * 商品详情图片
     */
    private String intro;

    /**
     * 商品参数
     */
    private String params;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
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
        MsGoodsWithBLOBs other = (MsGoodsWithBLOBs) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSn() == null ? other.getSn() == null : this.getSn().equals(other.getSn()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCost() == null ? other.getCost() == null : this.getCost().equals(other.getCost()))
            && (this.getMktprice() == null ? other.getMktprice() == null : this.getMktprice().equals(other.getMktprice()))
            && (this.getMktEnable() == null ? other.getMktEnable() == null : this.getMktEnable().equals(other.getMktEnable()))
            && (this.getCatId() == null ? other.getCatId() == null : this.getCatId().equals(other.getCatId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getLastModify() == null ? other.getLastModify() == null : this.getLastModify().equals(other.getLastModify()))
            && (this.getViewCount() == null ? other.getViewCount() == null : this.getViewCount().equals(other.getViewCount()))
            && (this.getBuyCount() == null ? other.getBuyCount() == null : this.getBuyCount().equals(other.getBuyCount()))
            && (this.getThumbnail() == null ? other.getThumbnail() == null : this.getThumbnail().equals(other.getThumbnail()))
            && (this.getBig() == null ? other.getBig() == null : this.getBig().equals(other.getBig()))
            && (this.getSmall() == null ? other.getSmall() == null : this.getSmall().equals(other.getSmall()))
            && (this.getOrinal() == null ? other.getOrinal() == null : this.getOrinal().equals(other.getOrinal()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getParams() == null ? other.getParams() == null : this.getParams().equals(other.getParams()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSn() == null) ? 0 : getSn().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCost() == null) ? 0 : getCost().hashCode());
        result = prime * result + ((getMktprice() == null) ? 0 : getMktprice().hashCode());
        result = prime * result + ((getMktEnable() == null) ? 0 : getMktEnable().hashCode());
        result = prime * result + ((getCatId() == null) ? 0 : getCatId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getCreatime() == null) ? 0 : getCreatime().hashCode());
        result = prime * result + ((getLastModify() == null) ? 0 : getLastModify().hashCode());
        result = prime * result + ((getViewCount() == null) ? 0 : getViewCount().hashCode());
        result = prime * result + ((getBuyCount() == null) ? 0 : getBuyCount().hashCode());
        result = prime * result + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        result = prime * result + ((getBig() == null) ? 0 : getBig().hashCode());
        result = prime * result + ((getSmall() == null) ? 0 : getSmall().hashCode());
        result = prime * result + ((getOrinal() == null) ? 0 : getOrinal().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getParams() == null) ? 0 : getParams().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", description=").append(description);
        sb.append(", intro=").append(intro);
        sb.append(", params=").append(params);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
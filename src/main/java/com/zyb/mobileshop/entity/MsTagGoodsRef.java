package com.zyb.mobileshop.entity;

import com.zyb.mobileshop.entity.brief.BriefGoods;
import com.zyb.mobileshop.entity.brief.BriefTag;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsTagGoodsRef implements Serializable {
    /**
     * 编号，采用Mysql自增主键
     */
    private Integer id;

    /**
     * 标签编号
     */
    private Integer tagId;

    /**
     * 商品编号
     */
    private Integer goodsId;

    /**
     * 排序
     */
    private Short sort;

    /**
     * 标签和商品建立关联的时间
     */
    private Date creatime;

    /**
     * 标签与商品关联关系更改的时间
     */
    private Date modifytime;

    private BriefGoods briefGoods;
    private BriefTag briefTag;

    public BriefGoods getBriefGoods() {
        return briefGoods;
    }

    public void setBriefGoods(BriefGoods briefGoods) {
        this.briefGoods = briefGoods;
    }

    public BriefTag getBriefTag() {
        return briefTag;
    }

    public void setBriefTag(BriefTag briefTag) {
        this.briefTag = briefTag;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
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
        MsTagGoodsRef other = (MsTagGoodsRef) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTagId() == null ? other.getTagId() == null : this.getTagId().equals(other.getTagId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTagId() == null) ? 0 : getTagId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
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
        sb.append(", tagId=").append(tagId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", sort=").append(sort);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
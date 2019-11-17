package com.zyb.mobileshop.entity;

import com.zyb.mobileshop.entity.brief.BriefGoodsType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsGoodsCat implements Serializable {
    private Integer catId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父分类编号，若有则填
     */
    private Integer parentId;

    /**
     * 分类路径，用来分别分类的位置
     */
    private String catPath;

    /**
     * 分类下包含得商品数量
     */
    private Integer goodsCount;

    /**
     * 排序，可以改变分类在首页显示得位置
     */
    private Integer sort;

    /**
     * 类型编号
     */
    private Integer typeId;

    /**
     * 是否显示，显示为0，不显示是1
     */
    private Byte listShow;

    /**
     * 分类的图片
     */
    private String image;

    /**
     * 创建分类的时间
     */
    private Date creatime;

    /**
     * 修改分类的时间
     */
    private Date modifytime;

    private BriefGoodsType briefGoodsType;

    public BriefGoodsType getBriefGoodsType() {
        return briefGoodsType;
    }

    public void setBriefGoodsType(BriefGoodsType briefGoodsType) {
        this.briefGoodsType = briefGoodsType;
    }

    private static final long serialVersionUID = 1L;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCatPath() {
        return catPath;
    }

    public void setCatPath(String catPath) {
        this.catPath = catPath;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Byte getListShow() {
        return listShow;
    }

    public void setListShow(Byte listShow) {
        this.listShow = listShow;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
        MsGoodsCat other = (MsGoodsCat) that;
        return (this.getCatId() == null ? other.getCatId() == null : this.getCatId().equals(other.getCatId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getCatPath() == null ? other.getCatPath() == null : this.getCatPath().equals(other.getCatPath()))
            && (this.getGoodsCount() == null ? other.getGoodsCount() == null : this.getGoodsCount().equals(other.getGoodsCount()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getListShow() == null ? other.getListShow() == null : this.getListShow().equals(other.getListShow()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCatId() == null) ? 0 : getCatId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getCatPath() == null) ? 0 : getCatPath().hashCode());
        result = prime * result + ((getGoodsCount() == null) ? 0 : getGoodsCount().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getListShow() == null) ? 0 : getListShow().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
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
        sb.append(", catId=").append(catId);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", catPath=").append(catPath);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", sort=").append(sort);
        sb.append(", typeId=").append(typeId);
        sb.append(", listShow=").append(listShow);
        sb.append(", image=").append(image);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
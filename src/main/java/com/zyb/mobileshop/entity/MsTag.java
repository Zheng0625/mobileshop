package com.zyb.mobileshop.entity;

import com.zyb.mobileshop.entity.brief.BriefBrand;
import com.zyb.mobileshop.entity.brief.BriefGoods;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 
 */
public class MsTag implements Serializable {
    /**
     * 标签编号
     */
    private Integer tagId;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 标签类型,0:商品标签，1：品牌标签
     */
    private Byte type;

    /**
     * 标签下商品/品牌下数量
     */
    private Integer count;

    /**
     * 排序，可以改变标签在分组中得显示位置
     */
    private Short sort;

    private Byte team;

    /**
     * 创建标签的时间
     */
    private Date creatime;

    /**
     * 修改标签的时间
     */
    private Date modifytime;

    private List<BriefGoods> bgs;

    private List<BriefBrand> bbs;

    public List<BriefGoods> getBgs() {
        return bgs;
    }

    public void setBgs(List<BriefGoods> bgs) {
        this.bgs = bgs;
    }

    public List<BriefBrand> getBbs() {
        return bbs;
    }

    public void setBbs(List<BriefBrand> bbs) {
        this.bbs = bbs;
    }

    private static final long serialVersionUID = 1L;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Byte getTeam() {
        return team;
    }

    public void setTeam(Byte team) {
        this.team = team;
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
        MsTag other = (MsTag) that;
        return (this.getTagId() == null ? other.getTagId() == null : this.getTagId().equals(other.getTagId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getTeam() == null ? other.getTeam() == null : this.getTeam().equals(other.getTeam()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTagId() == null) ? 0 : getTagId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getTeam() == null) ? 0 : getTeam().hashCode());
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
        sb.append(", tagId=").append(tagId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", count=").append(count);
        sb.append(", sort=").append(sort);
        sb.append(", team=").append(team);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
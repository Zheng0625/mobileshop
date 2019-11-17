package com.zyb.mobileshop.entity;

import com.zyb.mobileshop.entity.brief.BriefBrand;
import com.zyb.mobileshop.entity.brief.BriefGoodsCat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author 
 */
public class MsGoods implements Serializable {
    /**
     * 编号
     */
    private Integer goodsId;

    /**
     * 名称
     */
    private String name;

    /**
     * 货号
     */
    private String sn;

    /**
     * 简介
     */
    private String brief;

    /**
     * 价格
     */
    private Double price;

    /**
     * 消费
     */
    private Double cost;

    /**
     * 商品市场价
     */
    private Double mktprice;

    /**
     * 是否上架，0上，1不上
     */
    private Byte mktEnable;

    /**
     * 分类编号
     */
    private Integer catId;

    /**
     * 品牌编号
     */
    private Integer brandId;

    /**
     * 商品重量
     */
    private Double weight;

    /**
     * 创建时间
     */
    private Date creatime;

    /**
     * 最后修改时间
     */
    private Date lastModify;

    /**
     * 浏览次数
     */
    private Integer viewCount;

    /**
     * 购买次数
     */
    private Integer buyCount;

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
    private String orinal;

    private BriefGoodsCat briefGoodsCat;
    private BriefGoodsCat briefGoodsCat2;
    private List<MsGoodsImg> gis;
    private MsGoodsStore goodStore;

    public BriefGoodsCat getBriefGoodsCat2() {
        return briefGoodsCat2;
    }

    public void setBriefGoodsCat2(BriefGoodsCat briefGoodsCat2) {
        this.briefGoodsCat2 = briefGoodsCat2;
    }

    public List<MsGoodsImg> getGis() {
        return gis;
    }

    public void setGis(List<MsGoodsImg> gis) {
        this.gis = gis;
    }

    public MsGoodsStore getGoodStore() {
        return goodStore;
    }

    public void setGoodStore(MsGoodsStore goodStore) {
        this.goodStore = goodStore;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private BriefBrand briefBrand;

    public BriefBrand getBriefBrand() {
        return briefBrand;
    }

    public void setBriefBrand(BriefBrand briefBrand) {
        this.briefBrand = briefBrand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setMktprice(Double mktprice) {
        this.mktprice = mktprice;
    }

    public BriefGoodsCat getBriefGoodsCat() {
        return briefGoodsCat;
    }

    public void setBriefGoodsCat(BriefGoodsCat briefGoodsCat) {
        this.briefGoodsCat = briefGoodsCat;
    }

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Double getMktprice() {
        return mktprice;
    }

    public void setMktprice(double mktprice) {
        this.mktprice = mktprice;
    }

    public Byte getMktEnable() {
        return mktEnable;
    }

    public void setMktEnable(Byte mktEnable) {
        this.mktEnable = mktEnable;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
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

    public String getOrinal() {
        return orinal;
    }

    public void setOrinal(String orinal) {
        this.orinal = orinal;
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
        MsGoods other = (MsGoods) that;
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
            && (this.getOrinal() == null ? other.getOrinal() == null : this.getOrinal().equals(other.getOrinal()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", name=").append(name);
        sb.append(", sn=").append(sn);
        sb.append(", brief=").append(brief);
        sb.append(", price=").append(price);
        sb.append(", cost=").append(cost);
        sb.append(", mktprice=").append(mktprice);
        sb.append(", mktEnable=").append(mktEnable);
        sb.append(", catId=").append(catId);
        sb.append(", brandId=").append(brandId);
        sb.append(", weight=").append(weight);
        sb.append(", creatime=").append(creatime);
        sb.append(", lastModify=").append(lastModify);
        sb.append(", viewCount=").append(viewCount);
        sb.append(", buyCount=").append(buyCount);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", big=").append(big);
        sb.append(", small=").append(small);
        sb.append(", orinal=").append(orinal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
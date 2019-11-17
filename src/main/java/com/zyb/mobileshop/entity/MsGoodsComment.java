package com.zyb.mobileshop.entity;

import com.zyb.mobileshop.entity.brief.BriefGoods;
import com.zyb.mobileshop.entity.brief.BriefMember;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsGoodsComment implements Serializable {
    /**
     * 评论编号
     */
    private Integer commentId;

    /**
     * 订单编号
     */
    private Integer orderId;

    /**
     * 商品编号
     */
    private Integer goodsId;

    /**
     * 会员编号
     */
    private Integer memberId;

    /**
     * 分数等级
     */
    private Byte score;

    /**
     * 是否公开
     */
    private Byte isopen;

    /**
     * 创建评论时间
     */
    private Date creatime;

    /**
     * 评价内容
     */
    private String content;
    private BriefGoods briefGoods;
    private BriefMember briefMember;

    public BriefGoods getBriefGoods() {
        return briefGoods;
    }

    public void setBriefGoods(BriefGoods briefGoods) {
        this.briefGoods = briefGoods;
    }

    public BriefMember getBriefMember() {
        return briefMember;
    }

    public void setBriefMember(BriefMember briefMember) {
        this.briefMember = briefMember;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public Byte getIsopen() {
        return isopen;
    }

    public void setIsopen(Byte isopen) {
        this.isopen = isopen;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        MsGoodsComment other = (MsGoodsComment) that;
        return (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getIsopen() == null ? other.getIsopen() == null : this.getIsopen().equals(other.getIsopen()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getIsopen() == null) ? 0 : getIsopen().hashCode());
        result = prime * result + ((getCreatime() == null) ? 0 : getCreatime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", memberId=").append(memberId);
        sb.append(", score=").append(score);
        sb.append(", isopen=").append(isopen);
        sb.append(", creatime=").append(creatime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.zyb.mobileshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsMemberAddress implements Serializable {
    /**
     * 会员收货地址编号
     */
    private Integer addressId;

    /**
     * 会员编号
     */
    private Integer memberId;

    /**
     * 会员收货地址所在省
     */
    private String province;

    /**
     * 会员收货地址所在市
     */
    private String city;

    /**
     * 会员收货地址所在区
     */
    private String region;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 收货人姓名
     */
    private String receiver;

    /**
     * 创建时间
     */
    private Date creatime;

    /**
     * 修改时间
     */
    private Date modifytime;

    /**
     * 收货人地址
     */
    private String addr;

    private MsMember msMember;

    public MsMember getMsMember() {
        return msMember;
    }

    public void setMsMember(MsMember msMember) {
        this.msMember = msMember;
    }

    private static final long serialVersionUID = 1L;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
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
        MsMemberAddress other = (MsMemberAddress) that;
        return (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getCreatime() == null ? other.getCreatime() == null : this.getCreatime().equals(other.getCreatime()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
            && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getCreatime() == null) ? 0 : getCreatime().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressId=").append(addressId);
        sb.append(", memberId=").append(memberId);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", mobile=").append(mobile);
        sb.append(", receiver=").append(receiver);
        sb.append(", creatime=").append(creatime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", addr=").append(addr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.zyb.mobileshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class MsMember implements Serializable {
    /**
     * 会员编号
     */
    private Integer memberId;

    /**
     * 会员用户名
     */
    private String uname;

    /**
     * 会员密码
     */
    private String password;

    /**
     * 会员邮箱
     */
    private String email;

    /**
     * 会员性别
     */
    private Short sex;

    /**
     * 会员电话
     */
    private String mobile;

    /**
     * 会员注册时间
     */
    private Date regtime;

    /**
     * 会员上次登录时间
     */
    private Date lastlogin;

    /**
     * 会员头像
     */
    private String image;

    private static final long serialVersionUID = 1L;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
        MsMember other = (MsMember) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getRegtime() == null ? other.getRegtime() == null : this.getRegtime().equals(other.getRegtime()))
            && (this.getLastlogin() == null ? other.getLastlogin() == null : this.getLastlogin().equals(other.getLastlogin()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getRegtime() == null) ? 0 : getRegtime().hashCode());
        result = prime * result + ((getLastlogin() == null) ? 0 : getLastlogin().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberId=").append(memberId);
        sb.append(", uname=").append(uname);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", sex=").append(sex);
        sb.append(", mobile=").append(mobile);
        sb.append(", regtime=").append(regtime);
        sb.append(", lastlogin=").append(lastlogin);
        sb.append(", image=").append(image);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
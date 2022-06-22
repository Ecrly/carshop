package com.karl.carshop.entity;

import java.io.Serializable;
import java.util.Objects;

public class User extends BaseEntity implements Serializable {
    private Integer uid;
    private String userName;
    private Integer sex;
    private String userPhone;
    private String userEmail;
    private String usercode;
    private String password;
    private String avatar;
    private String fullName;
    private String salt;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(getUid(), user.getUid()) &&
                Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getSex(), user.getSex()) &&
                Objects.equals(getUserPhone(), user.getUserPhone()) &&
                Objects.equals(getUserEmail(), user.getUserEmail()) &&
                Objects.equals(getUsercode(), user.getUsercode()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getAvatar(), user.getAvatar()) &&
                Objects.equals(getFullName(), user.getFullName()) &&
                Objects.equals(getSalt(), user.getSalt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUid(), getUserName(), getSex(), getUserPhone(), getUserEmail(), getUsercode(), getPassword(), getAvatar(), getFullName(), getSalt());
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", usercode='" + usercode + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", fullName='" + fullName + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}

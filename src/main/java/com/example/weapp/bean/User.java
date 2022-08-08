package com.example.weapp.bean;

import java.util.Objects;

/**
 * @Author: Cqmax
 * @Date: 2022/7/28 14:33
 * @Version 1.0
 */

//注解：用户类，重写tostring ，equals ，hashcode
public class User {
    private String id;
    private String password;
    private String gender;
    private String birthday;
    private String lastLoginTime;
    private String lastLoginIp;
    private String userLevel;
    private String nickname;
    private String mobile;
    private String avatar;
    private String wechatOpenid;
    private String sessionKey;
    private String status;
    private String deleted;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", lastLoginTime='" + lastLoginTime + '\'' +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", userLevel='" + userLevel + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", avatar='" + avatar + '\'' +
                ", wechatOpenid='" + wechatOpenid + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", status='" + status + '\'' +
                ", deleted='" + deleted + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(password, user.password) && Objects.equals(gender, user.gender) && Objects.equals(birthday, user.birthday) && Objects.equals(lastLoginTime, user.lastLoginTime) && Objects.equals(lastLoginIp, user.lastLoginIp) && Objects.equals(userLevel, user.userLevel) && Objects.equals(nickname, user.nickname) && Objects.equals(mobile, user.mobile) && Objects.equals(avatar, user.avatar) && Objects.equals(wechatOpenid, user.wechatOpenid) && Objects.equals(sessionKey, user.sessionKey) && Objects.equals(status, user.status) && Objects.equals(deleted, user.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, gender, birthday, lastLoginTime, lastLoginIp, userLevel, nickname, mobile, avatar, wechatOpenid, sessionKey, status, deleted);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getWechatOpenid() {
        return wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}

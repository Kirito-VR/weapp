package com.example.weapp.bean;

import java.util.Objects;

/**
 * @Author: xm
 * @Date: 2022/7/28 14:33
 * @Version 1.0
 */

//注解：用户类，重写tostring ，equals ，hascode
public class User {
    private String userID;
    private String userNick;
    private String userPassword;
    private String userPhoneNumber;
    private String userAddress;

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userNick='" + userNick + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userID, user.userID) && Objects.equals(userNick, user.userNick) && Objects.equals(userPassword, user.userPassword) && Objects.equals(userPhoneNumber, user.userPhoneNumber) && Objects.equals(userAddress, user.userAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, userNick, userPassword, userPhoneNumber, userAddress);
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}

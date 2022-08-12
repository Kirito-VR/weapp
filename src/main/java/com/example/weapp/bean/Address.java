package com.example.weapp.bean;

import java.util.Objects;

/**
 * Created by xm on 2022/8/10 10:29
 * title:
 */
public class Address {
    private String id;
    private String addressName;
    private String userId;
    private String province;
    private String city;
    private String county;
    private String addressDetail;
    private String areaCode;
    private String postalCode;
    private String tel;
    private String isDefault;
    private String deleted;
    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", addressName='" + addressName + '\'' +
                ", userId='" + userId + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", tel='" + tel + '\'' +
                ", isDefault='" + isDefault + '\'' +
                ", deleted='" + deleted + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(addressName, address.addressName) && Objects.equals(userId, address.userId) && Objects.equals(province, address.province) && Objects.equals(city, address.city) && Objects.equals(county, address.county) && Objects.equals(addressDetail, address.addressDetail) && Objects.equals(areaCode, address.areaCode) && Objects.equals(postalCode, address.postalCode) && Objects.equals(tel, address.tel) && Objects.equals(isDefault, address.isDefault) && Objects.equals(deleted, address.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressName, userId, province, city, county, addressDetail, areaCode, postalCode, tel, isDefault, deleted);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}

package com.example.weapp.service;

import com.example.weapp.bean.Address;

import java.util.List;

/**
 * Created by xm on 2022/8/10 10:38
 * title:
 */
//小程序用户收获地址操作接口
public interface AddressService {
    //定义根据用户获取收获地址函数
    public List<Address> getAddressById(String id);
    public Boolean addAddress(Address address);
}

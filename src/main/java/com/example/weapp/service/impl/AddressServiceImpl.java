package com.example.weapp.service.impl;

import com.example.weapp.bean.Address;
import com.example.weapp.mapper.AddressMapper;
import com.example.weapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xm on 2022/8/10 10:39
 * title:
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getAddressById(String id) {
        List<Address> addressList=null;
        addressList=addressMapper.getAddressById(id);
        return addressList;
    }
    //新增地址函数，首先调用找到所有的地址，然后创建一个id，确保唯一性，
    @Override
    public Boolean addAddress(Address address) {
        Boolean addResult=false;
        //调用mapper的获取所有地址方法
        List<Address> allAddress=null;
        allAddress=addressMapper.getAllAddress();
        address.setId((allAddress.size()+1)+"");
        address.setDeleted("0");
        addResult=addressMapper.addAddress(address);
        return addResult;
    }
}

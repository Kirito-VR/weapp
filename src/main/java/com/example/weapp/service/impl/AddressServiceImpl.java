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
}

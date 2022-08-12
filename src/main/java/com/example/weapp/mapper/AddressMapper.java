package com.example.weapp.mapper;

import com.example.weapp.bean.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by xm on 2022/8/10 10:46
 * title:
 */
@Mapper
public interface AddressMapper {
    List<Address> getAddressById(String id);
}

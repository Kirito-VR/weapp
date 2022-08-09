package com.example.weapp.mapper;

import com.example.weapp.bean.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderInfoMapper {

    List<OrderInfo> getOrderInfoList(String orderinfo_oid);
}

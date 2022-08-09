package com.example.weapp.mapper;

import com.example.weapp.bean.Order;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> getOrderList();

    List<Order> findInputOrderIdList(String id);

    Boolean delOrderData(String id);

    Boolean saveModifyOrder(Order order);
}

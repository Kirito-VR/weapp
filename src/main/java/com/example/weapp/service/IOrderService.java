package com.example.weapp.service;

import com.example.weapp.bean.Order;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface IOrderService {
    List<Order> getOrderList();

    List<Order> findInputOrderIdList(String id);

    Boolean delOrderData(String id);

    Boolean saveModifyOrder(Order order);
}

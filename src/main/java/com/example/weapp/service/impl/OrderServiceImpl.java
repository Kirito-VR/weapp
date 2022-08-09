package com.example.weapp.service.impl;

import com.example.weapp.bean.Order;
import com.example.weapp.mapper.OrderMapper;
import com.example.weapp.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrderList() {
        return orderMapper.getOrderList();
    }

    @Override
    public List<Order> findInputOrderIdList(String id) {
        return orderMapper.findInputOrderIdList(id);
    }

    @Override
    public Boolean delOrderData(String order_id) {
        return orderMapper.delOrderData(order_id);
    }

    @Override
    public Boolean saveModifyOrder(Order order) {
        return orderMapper.saveModifyOrder(order);
    }

}

package com.example.weapp.service.impl;

import com.example.weapp.bean.Order;
import com.example.weapp.bean.OrderInfo;
import com.example.weapp.mapper.OrderMapper;
import com.example.weapp.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Order> findInputOrderIdList(String order_id) {
        return orderMapper.findInputOrderIdList(order_id);
    }

    @Override
    public Boolean delOrderData(String order_id) {
        return orderMapper.delOrderData(order_id);
    }

    @Override
    public Boolean saveModifyOrder(String order_id, String order_uid, String order_Trademoney, String order_Tradeld, String status) {
        return orderMapper.saveModifyOrder(order_id, order_uid, order_Trademoney, order_Tradeld, status);
    }

}

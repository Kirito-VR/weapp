package com.example.weapp.service.impl;
import com.example.weapp.bean.Order;
import com.example.weapp.mapper.ReactOrderMapper;
import com.example.weapp.service.ReactOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReactOrderServiceImpl implements ReactOrderService {
    @Autowired
    private ReactOrderMapper reactOrderMapper;

    @Override
    public List<Order> getOrderListById(int user_id) {
        List<Order> orderList=null;
        orderList=reactOrderMapper.getOrderListById(user_id);
        return orderList;
    }

    @Override
    public boolean InOrder(Order order) {
        boolean Inresult;
        Inresult=reactOrderMapper.InOrder(order);
        return Inresult;
    }

    @Override
    public boolean DeOrder(Order order) {
        boolean Deresult;
        Deresult=reactOrderMapper.DeOrder(order);
        return Deresult;
    }

    @Override
    public boolean MoOrder(Order order) {
        boolean Moresult;
        Moresult=reactOrderMapper.MoOrder(order);
        return Moresult;
    }
}

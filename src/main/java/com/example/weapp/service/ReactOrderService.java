package com.example.weapp.service;
import com.example.weapp.bean.Order;

import java.util.List;

public interface ReactOrderService {

    List<Order> getOrderListById(int user_id);//根据用户编号获取订单信息

    boolean InOrder(Order order);//添加
    boolean DeOrder(Order order);//删除
    boolean MoOrder(Order order);//修改
}

package com.example.weapp.service;

import com.example.weapp.bean.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getOrderList();

    List<Order> findInputOrderIdList(String id);

    Boolean delOrderData(String id);

    Boolean saveModifyOrder(Order order);

//    Boolean saveModifyOrder(String order_id, String order_uid, String order_Trademoney, String order_Tradeld, String status);

    //    定义根据用户ID获取订单接口
    List<Order> getOrderListByUserId(String id);
}
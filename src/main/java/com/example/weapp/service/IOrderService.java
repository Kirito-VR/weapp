package com.example.weapp.service;

import com.example.weapp.bean.Order;
import com.example.weapp.bean.OrderInfo;

import java.util.List;

public interface IOrderService {
    List<Order> getOrderList();

    List<Order> findInputOrderIdList(String order_id);

    Boolean delOrderData(String order_id);

    Boolean saveModifyOrder(String order_id, String order_uid, String order_Trademoney, String order_Tradeld, String status);
}

package com.example.weapp.service;

import com.example.weapp.bean.OrderInfo;

import java.util.List;

public interface IOrderInfoService {

    List<OrderInfo> getOrderInfoList(String orderinfo_oid);
}

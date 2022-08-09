package com.example.weapp.service;

import com.example.weapp.bean.OrderGoods;

import java.util.List;

public interface IOrderGoodsService {

    List<OrderGoods> getOrderGoodsList(String id);
}

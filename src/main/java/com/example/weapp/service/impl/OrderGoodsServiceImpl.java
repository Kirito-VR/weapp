package com.example.weapp.service.impl;

import com.example.weapp.bean.OrderGoods;
import com.example.weapp.mapper.OrderGoodsMapper;
import com.example.weapp.service.IOrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderGoodsServiceImpl implements IOrderGoodsService {
    @Autowired
    private OrderGoodsMapper orderGoodsMapper;

    @Override
    public List<OrderGoods> getOrderGoodsList(String id){
        return orderGoodsMapper.getOrderGoodsList(id);
    }
}

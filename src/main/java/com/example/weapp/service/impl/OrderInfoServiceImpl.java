package com.example.weapp.service.impl;

import com.example.weapp.bean.OrderInfo;
import com.example.weapp.mapper.OrderInfoMapper;
import com.example.weapp.service.IOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderInfoServiceImpl implements IOrderInfoService {
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public List<OrderInfo> getOrderInfoList(String orderinfo_oid){
        return orderInfoMapper.getOrderInfoList(orderinfo_oid);
    }
}

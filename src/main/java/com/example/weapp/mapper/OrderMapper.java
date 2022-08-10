package com.example.weapp.mapper;

import com.example.weapp.bean.Order;
import com.example.weapp.bean.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> getOrderList();

    List<Order> findInputOrderIdList(String order_id);

    Boolean delOrderData(String order_id);

    Boolean saveModifyOrder(String order_id, String order_uid, String order_Trademoney, String order_Tradeld, String status);
    List<Order> getOrderListByUserId(String id);
}

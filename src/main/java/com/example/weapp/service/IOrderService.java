package com.example.weapp.service;

import com.example.weapp.bean.Order;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface IOrderService {
    List<Order> getOrderList();

    List<Order> findInputOrderIdList(String id);

    Boolean delOrderData(String order_id);

    Boolean saveModifyOrder(Order order);
    /*BigInteger id, Integer user_id, String order_sn, Integer order_status, String consignee,
                            String mobile, String address, String message, BigDecimal goods_price, BigDecimal freight_price,
                            BigDecimal coupon_price, BigDecimal integral_price, BigDecimal groupon_price, BigDecimal order_price,
                            BigDecimal actual_price, String pay_id, Date pay_time, String ship_cn, String ship_channel, Date ship_time,
                            Date confirm_time, Integer comments, Date end_time, Integer deleted*/
}

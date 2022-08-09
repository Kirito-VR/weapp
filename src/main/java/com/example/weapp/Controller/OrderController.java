package com.example.weapp.Controller;

import com.example.weapp.bean.Order;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * @Author: Cqmax
 * @Date: 2022/7/27 21:55
 * @Version 1.0
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private IOrderService iOrderService;

    //获取orderList
    @GetMapping("/getOrderList")
    public HttpResult getGoodList() {
        List<Order> orderList = null;
        // 在此处插入代码，实现获得列表并赋值给相应的List;
        return HttpResult.ok(iOrderService.getOrderList());
    }

    @GetMapping("/findInputOrderIdList")
    public HttpResult findInputOrderIdList(@RequestParam String id) {
        System.out.println("测试id：" + id);
        List<Order> findOrderList = null;
        return HttpResult.ok(iOrderService.findInputOrderIdList(id));
    }

    @GetMapping("/delOrderData")
    public HttpResult delOrderData(@RequestParam String order_id) {
        System.out.println("拿到删除order_id：" + order_id);
        Boolean delOrderData = null;
        return HttpResult.ok(iOrderService.delOrderData(order_id));
    }

    @GetMapping("saveModifyOrder")
    public HttpResult saveModifyOrder(
            @RequestParam BigInteger id, Integer user_id, String order_sn, Integer order_status, String consignee,
            String mobile, String address, String message, BigDecimal goods_price, BigDecimal freight_price,
            BigDecimal coupon_price, BigDecimal integral_price, BigDecimal groupon_price, BigDecimal order_price,
            BigDecimal actual_price, String pay_id, Date pay_time, String ship_cn, String ship_channel, Date ship_time,
            Date confirm_time, Integer comments, Date end_time, Integer deleted) {
        Order order = new Order();
        order.setId(id);
        order.setUser_id(user_id);
        order.setOrder_sn(order_sn);
        order.setOrder_status(order_status);
        order.setConsignee(consignee);
        order.setMobile(mobile);
        order.setAddress(address);
        order.setMessage(message);
        order.setGoods_price(goods_price);
        order.setFreight_price(freight_price);
        order.setCoupon_price(coupon_price);
        order.setIntegral_price(integral_price);
        order.setGroupon_price(groupon_price);
        order.setOrder_price(order_price);
        order.setActual_price(actual_price);
        order.setPay_id(pay_id);
        order.setPay_time(pay_time);
        order.setShip_cn(ship_cn);
        order.setShip_channel(ship_channel);
        order.setShip_time(ship_time);
        order.setConfirm_time(confirm_time);
        order.setComments(comments);
        order.setEnd_time(end_time);
        order.setDeleted(deleted);
        System.out.println("拿到数据"+order.getId());

        Boolean saveModifyOrder = null;
        return HttpResult.ok(iOrderService.saveModifyOrder(order));
        /*System.out.println("拿到修改的数据" + id + user_id + order_Trademoney + order_Tradeld + status);
        Boolean saveModifyOrder = null;
        return HttpResult.ok(iOrderService.saveModifyOrder(id,user_id,order_sn,order_status,consignee,mobile,address,message,goods_price,freight_price,coupon_price,integral_price,groupon_price,order_price,
                actual_price,pay_id,pay_time,ship_cn,ship_channel,ship_time,confirm_time,comments,end_time,deleted));*/
    }
}



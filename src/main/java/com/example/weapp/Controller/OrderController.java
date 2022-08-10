package com.example.weapp.Controller;

import com.example.weapp.bean.Order;
import com.example.weapp.bean.OrderInfo;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.IOrderService;
import com.example.weapp.service.impl.OrderServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public HttpResult findInputOrderIdList(@RequestParam String order_id) {
        System.out.println("测试order_id：" + order_id);
        List<Order> findOrderList = null;
        return HttpResult.ok(iOrderService.findInputOrderIdList(order_id));
    }

    @GetMapping("/delOrderData")
    public HttpResult delOrderData(@RequestParam String order_id) {
        System.out.println("拿到删除order_id：" + order_id);
        Boolean delOrderData = null;
        return HttpResult.ok(iOrderService.delOrderData(order_id));
    }

    @GetMapping("saveModifyOrder")
    public HttpResult saveModifyOrder(@RequestParam String order_id, String order_uid, String order_Trademoney, String order_Tradeld, String status) {
        System.out.println("拿到修改的数据" + order_id + order_uid + order_Trademoney + order_Tradeld + status);
        Boolean saveModifyOrder = null;
        return HttpResult.ok(iOrderService.saveModifyOrder(order_id, order_uid, order_Trademoney, order_Tradeld, status));
    }

}

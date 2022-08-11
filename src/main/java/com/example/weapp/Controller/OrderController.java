package com.example.weapp.Controller;

import com.example.weapp.bean.Order;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public HttpResult delOrderData(@RequestParam String id) {
        System.out.println("拿到删除id：" + id);
        Boolean delOrderData = null;
        return HttpResult.ok(iOrderService.delOrderData(id));
    }

    @PostMapping("saveModifyOrder")
    public HttpResult saveModifyOrder(@RequestBody Order order) {
        System.out.println("拿到的数据：" + order);
        Boolean saveModifyOrder = iOrderService.saveModifyOrder(order);
        return HttpResult.ok(saveModifyOrder);
    }
}
package com.example.weapp.Controller;

import com.example.weapp.bean.Order;
import com.example.weapp.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Cqmax
 * @Date: 2022/7/27 21:55
 * @Version 1.0
 */
@RequestMapping("order")
@RestController
public class OrderController {

    @GetMapping("/getOrderList")
    public HttpResult getGoodList(){
        List<Order> orderList = null;

        // 在此处插入代码，实现获得列表并赋值给相应的List;

        return HttpResult.ok(orderList);
    }



}

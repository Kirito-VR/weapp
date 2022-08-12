package com.example.weapp.Controller.ReactController;

import com.example.weapp.bean.Cart;
import com.example.weapp.bean.Order;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.ReactOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("App/Order")
public class ReactOrderController {

    @Autowired
    private ReactOrderService reactOrderService;

//    获取订单信息
    @GetMapping("/getOrderList")
    public HttpResult getOrderListById(@RequestParam int user_id){
        System.out.println("查询订单数据开始");
        System.out.println(user_id);

        List<Order> orderList = null;
        orderList= reactOrderService.getOrderListById(user_id);

        System.out.println("测试结束");
        System.out.println(orderList);
        return HttpResult.ok(orderList);
    }
//    添加订单记录
    @PostMapping(value = "/InOrder")
    public HttpResult InOrderList(@RequestBody Order order){
        System.out.println("保存订单数据开始..............");
        System.out.println(order);

        boolean InResult=reactOrderService.InOrder(order);
        return HttpResult.ok(InResult);
    }
//    根据订单编号删除订单记录
    @PostMapping(value = "/DeOrder")
    public HttpResult DeOrderList(@RequestBody Order order){
        System.out.println("删除订单数据开始..............");
        System.out.println(order);

        boolean DeResult=reactOrderService.DeOrder(order);
        return HttpResult.ok(DeResult);
    }
//    修改订单记录
    @PostMapping(value = "/MoOrder")
    public HttpResult MoOrderList(@RequestBody Order order){
        System.out.println("修改订单记录开始..............");
        System.out.println(order);

        boolean MoResult=reactOrderService.MoOrder(order);
        return HttpResult.ok(MoResult);
    }
}

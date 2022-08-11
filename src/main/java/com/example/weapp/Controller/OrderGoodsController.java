package com.example.weapp.Controller;

import com.example.weapp.bean.OrderGoods;
import com.example.weapp.bean.Order;

import com.example.weapp.http.HttpResult;
import com.example.weapp.service.IOrderGoodsService;

import com.example.weapp.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orderinfo")
public class OrderGoodsController {

    @Autowired
    private IOrderGoodsService iOrderGoodsService;
    @Autowired
    private IOrderService iOrderService;


    // 获取orderInfoList
    @GetMapping("/getOrderInfoList")
    public HttpResult getOrderGoodsList(@RequestParam String id) {
        System.out.println("测试id：" + id);
        List<OrderGoods> getOrderGoodsList = null;
        System.out.println(iOrderGoodsService.getOrderGoodsList(id));

        return HttpResult.ok(iOrderGoodsService.getOrderGoodsList(id));
    }
    //    封装，根据用户id获取
//    现根据用户id获取他的订单
    @GetMapping("/getOrderInfo")
    public HttpResult getOrderInfoByUserID(@RequestParam String id) {
        List<Order> ordersList=null;
        List<OrderGoods> orderInfoList=null;
        List<OrderGoods> temp=null;
        ordersList= iOrderService.getOrderListByUserId(id);
        //一个订单可能获取多个详情
//        orderInfoList=IOrderGoodsService.getOrderGoodsList(ordersList.get(0).getOrder_id());
//        for(int i=1;i<ordersList.size();i++){
//            temp=IOrderGoodsService.getOrderGoodsList(ordersList.get(i).getOrder_id());
//
//            for(int j=0;j<temp.size();j++){
//                orderInfoList.add(temp.get(j));
//            }
//            temp.clear();
//        }
        return HttpResult.ok(orderInfoList);
    }
}
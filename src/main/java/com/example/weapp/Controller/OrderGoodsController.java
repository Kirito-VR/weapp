package com.example.weapp.Controller;

import com.example.weapp.bean.OrderGoods;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.IOrderGoodsService;
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

    // 获取orderInfoList
    @GetMapping("/getOrderInfoList")
    public HttpResult getOrderGoodsList(@RequestParam String id) {
        System.out.println("测试id：" + id);
        List<OrderGoods> getOrderGoodsList = null;
        System.out.println(iOrderGoodsService.getOrderGoodsList(id));

        return HttpResult.ok(iOrderGoodsService.getOrderGoodsList(id));
    }

}

package com.example.weapp.Controller;

import com.example.weapp.bean.OrderInfo;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.IOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orderinfo")
public class OrderInfoController {

    @Autowired
    private IOrderInfoService iOrderInfoService;

    // 获取orderInfoList
    @GetMapping("/getOrderInfoList")
    public HttpResult getOrderInfoList(@RequestParam String orderinfo_oid) {
        System.out.println("测试orderInfo_oid：" + orderinfo_oid);
        List<OrderInfo> getOrderInfoList = null;
        System.out.println(iOrderInfoService.getOrderInfoList(orderinfo_oid));

        return HttpResult.ok(iOrderInfoService.getOrderInfoList(orderinfo_oid));
    }

}

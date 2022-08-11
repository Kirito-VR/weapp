//package com.example.weapp.Controller;
//
//import com.example.weapp.bean.Order;
//import com.example.weapp.bean.OrderInfo;
//import com.example.weapp.http.HttpResult;
//import com.example.weapp.service.IOrderInfoService;
//import com.example.weapp.service.IOrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("orderinfo")
//public class OrderInfoController {
//
//    @Autowired
//    private IOrderInfoService iOrderInfoService;
//    @Autowired
//    private IOrderService iOrderService;
//
//
//    // 获取orderInfoList
//    @GetMapping("/getOrderInfoList")
//    public HttpResult getOrderInfoList(@RequestParam String orderinfo_oid) {
//        System.out.println("测试orderInfo_oid：" + orderinfo_oid);
//        List<OrderInfo> getOrderInfoList = null;
//        System.out.println(iOrderInfoService.getOrderInfoList(orderinfo_oid));
//        return HttpResult.ok(iOrderInfoService.getOrderInfoList(orderinfo_oid));
//    }
//    封装，根据用户id获取
//    现根据用户id获取他的订单
//    @GetMapping("/getOrderInfo")
//    public HttpResult getOrderInfoByUserID(@RequestParam String id) {
//        List<Order> ordersList=null;
//        List<OrderInfo> orderInfoList=null;
//        List<OrderInfo> temp=null;
//        ordersList= iOrderService.getOrderListByUserId(id);
//        //一个订单可能获取多个详情
//        orderInfoList=iOrderInfoService.getOrderInfoList(ordersList.get(0).getOrder_id());
//        for(int i=1;i<ordersList.size();i++){
//            temp=iOrderInfoService.getOrderInfoList(ordersList.get(i).getOrder_id());
//
//            for(int j=0;j<temp.size();j++){
//                orderInfoList.add(temp.get(j));
//            }
//            temp.clear();
//        }
//        return HttpResult.ok(orderInfoList);
//    }
//}

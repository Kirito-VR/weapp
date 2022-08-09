package com.example.weapp.Controller;

import com.example.weapp.bean.SysGood;
import com.example.weapp.http.HttpResult;
import com.example.weapp.mapper.SysGoodMapper;
import com.example.weapp.service.SysGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Cqmax
 * @Date: 2022/7/28 13:59
 * @Version 1.0
 */

@RequestMapping("good")
@RestController
public class SysGoodController {
    @Autowired
    private SysGoodService sysGoodService;
    @GetMapping("/getGoodList")
    //public HttpResult getGoodList(@RequestParam String name){
    public HttpResult getGoodList(){
        return HttpResult.ok(sysGoodService.findByGoodInf());
    }
    @GetMapping("/addGoodList")
    public HttpResult addGoodList(SysGood sysGood) {
        System.out.println("添加商品进来了");

        sysGoodService.addGoodList(sysGood);
        return null;
    }
    @GetMapping("/delGoodList")
    public HttpResult delGoodList(SysGood sysGood){
        String id=sysGood.getId();
        //sysGoodService.delGoodList(id);
        //return HttpResult.ok(sysGoodService.delGoodList());
        System.out.println("返回的是什么："+sysGoodService.delGoodList(id));
        return HttpResult.ok(sysGoodService.delGoodList(id));
    }

    @GetMapping("/resGoodList")
    //public HttpResult getGoodList(@RequestParam String name){
    public HttpResult resGoodList(SysGood sysGood){
        sysGoodService.resGoodList(sysGood);

        //return HttpResult.ok(sysGoodService.resGoodList());
        return null;
    }
    @GetMapping("/selGoodList")
    //public HttpResult getGoodList(@RequestParam String name){
    public HttpResult selGoodList(SysGood sysGood){
       String name=sysGood.getGoods_name();

        return HttpResult.ok(sysGoodService.selByGoodInf(name));
    }
}

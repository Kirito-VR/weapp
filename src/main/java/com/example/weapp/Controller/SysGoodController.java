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
        //List<Good> goodList = null;
        // 在此处插入代码，实现获得good列表并赋值给goodList;
        return HttpResult.ok(sysGoodService.getGoodList());
    }
    @GetMapping("/addGoodList")
    public HttpResult addGoodList(SysGood SysGood) {
        System.out.println("添加商品进来了");
        String id = SysGood.getId();
        String name = SysGood.getName();
        double price=SysGood.getPrice();
        int stock=SysGood.getStock();
        String descripe=SysGood.getDescripe();
        String imgPath=SysGood.getImgPath();
        List addList=new ArrayList();
        addList.add(id);
        addList.add(name);
        addList.add(price);
        addList.add(stock);
        addList.add(descripe);
        addList.add(imgPath);
        System.out.println("传过来的addList:"+addList);
        System.out.println("img"+imgPath);
//        System.out.println("上面：" + name);
//        System.out.println("id：" + id);
        return null;
    }
}

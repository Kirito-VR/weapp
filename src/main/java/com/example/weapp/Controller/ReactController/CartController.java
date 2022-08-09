package com.example.weapp.Controller.ReactController;


import com.example.weapp.bean.Cart;
import com.example.weapp.bean.User;
import com.example.weapp.http.HttpResult;
import com.example.weapp.mapper.SysCartMapper;
import com.example.weapp.service.SysCartService;
import com.example.weapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("cart")

public class CartController {


    @Autowired
    private SysCartService sysCartService;

    @GetMapping("/getCartList")
    public HttpResult getCartList(){
        System.out.println("1111");
        List<Cart> cartList = null;
        cartList= sysCartService.getCartList();
        System.out.println(cartList);
        return HttpResult.ok(cartList);
    }

    @PostMapping("/addCart")
    public HttpResult AddCart(@RequestBody Cart cart)
    {

        System.out.println("add");
        boolean addCartResult=sysCartService.AddCart(cart);
        return HttpResult.ok(addCartResult);
    }


    @PostMapping("/deleteCart")
    public HttpResult DeleteCart(@RequestBody Cart cart)
    {
        System.out.println("del");
        boolean deleteCartResult= sysCartService.DeleteCart(cart);
        return HttpResult.ok(deleteCartResult);
    }
    }



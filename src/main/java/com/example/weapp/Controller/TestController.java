package com.example.weapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Cqmax
 * @Date: 2022/7/21 12:41
 * @Version 1.0
 */

@RestController
public class TestController {
    @GetMapping("/admin/test1")
    public String test1(){
        return "/test1/admin";
    }
    @GetMapping("/admin/test2")
    public String test2(){
        return "/test2/admin";
    }
    @GetMapping("/admin/test3")
    public String test3(){
        return "/test3/admin";
    }

}

package com.example.weapp.Controller;

import com.example.weapp.bean.User;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: xm
 * @Date: 2022/7/28 13:59
 * @Version 1.0
 */

@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    //获取所有的用户的信息，并且返回到httpResult里
    @GetMapping("/getUserList")
    public HttpResult getUserList(){

        List<User> userList = null;
        userList= userService.findAllUsers();
        return HttpResult.ok(userList);
    }
    //通过查询获取用户，查询依据：等待修改
    @GetMapping("/getUserListBySearch")
    public HttpResult getUserListBySearch()
    {
        List<User> userList=null;
        return HttpResult.ok(userList);
    }
}


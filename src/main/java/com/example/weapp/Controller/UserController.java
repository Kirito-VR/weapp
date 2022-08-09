package com.example.weapp.Controller;

import com.example.weapp.bean.User;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: xm
 * @Date: 2022/7/28 13:59
 * @Version 1.0
 */

@RestController
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
    public HttpResult getUserListBySearch(@RequestParam String username)
    {
        String userName=username;
        System.out.println("userName");
        List<User> userList=null;
        userList=userService.findUserBySearch(userName);
        System.out.println(userList);
        return HttpResult.ok(userList);
    }
    @PostMapping("/changeUser")
    public HttpResult changeUser(@RequestBody User user)
    {
        //修改函数,首先找到,然后修改.
        System.out.println(user);
        boolean changeResult=userService.changeUser(user);
        return HttpResult.ok(changeResult);
    }
}


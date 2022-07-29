package com.example.weapp.Controller;

import com.example.weapp.bean.User;
import com.example.weapp.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Cqmax
 * @Date: 2022/7/28 13:59
 * @Version 1.0
 */

@RequestMapping("user")
@RestController
public class UserController {
    @GetMapping("/getUserList")
    public HttpResult getUserList(){
        List<User> userList = null;

        // 在此处插入代码，实现获得列表并赋值给相应的List;

        return HttpResult.ok(userList);
    }
}


package com.example.weapp.service;

import com.example.weapp.bean.User;

import java.util.List;

/**
 * Created by xm on 2022/7/29 10:27
 * title:
 */

//注解：管理员查看对用户信息进行操作的接口
public interface UserService {
    //获取用户信息service层
    List<User> findAllUsers();
}

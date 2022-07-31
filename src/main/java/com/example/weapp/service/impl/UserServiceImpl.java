package com.example.weapp.service.impl;

import com.example.weapp.bean.User;
import com.example.weapp.mapper.UserMapper;
import com.example.weapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xm on 2022/7/29 10:27
 * title:
 */
@Service
public class UserServiceImpl implements UserService {
    //自动注入，调用mapper
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAllUsers() {
        //实现接口，调用mapper 返回
        List<User> userList=null;
        userList=userMapper.findAllUsers();
        return userList;
    }
    @Override
    public List<User> findUserBySearch(String userName) {
        List<User> userList=null;
        userList=userMapper.findUserBySearch(userName);
        return userList;
    }
    @Override
    public boolean changeUser(User user){
        boolean changeResult;
        changeResult=userMapper.changeUser(user);
        return changeResult;
    }

    @Override
    public boolean deleteUser(User user) {
        boolean deleteResult=userMapper.deleteUser(user);
        return deleteResult;
    }
}

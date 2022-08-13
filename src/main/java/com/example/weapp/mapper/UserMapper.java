package com.example.weapp.mapper;

import com.example.weapp.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by xm on 2022/7/29 10:29
 * title:
 * 注解：操作用户信息mapper层
 */
//
@Mapper
public interface UserMapper {
    ///功能：获取所有用户信息，测试：通过
    List<User> findAllUsers();
    List<User> findUserBySearch(String userName);
    boolean changeUser(User user);
    boolean deleteUser(User user);
    List<User> findUserByOpenid(String openid);
    boolean registerUser(User user);
}

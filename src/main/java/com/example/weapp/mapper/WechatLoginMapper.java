package com.example.weapp.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by xm on 2022/8/6 22:19
 * title:
 */
@Mapper
public interface WechatLoginMapper {
//    小程序登录请求控制器
//    定义两个接口
//    根据openid检验是否存在这个用户
    boolean findUser(String openId);
}

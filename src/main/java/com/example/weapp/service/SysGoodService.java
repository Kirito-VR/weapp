package com.example.weapp.service;

import com.example.weapp.bean.SysGood;

import java.util.List;

/**
 * 用户管理
 *
 * @Author ShiRongFa
 * @Date 2022-07-29
 */
public interface SysGoodService {

    //List<SysGood> getGoodList() ;
    List<SysGood> findByGoodInf();
    Object addGoodList(SysGood sysGood);
    Object delGoodList(String id);
    Object resGoodList(SysGood sysGood);
    List<SysGood> selByGoodInf(String name);


}

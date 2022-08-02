package com.example.weapp.service.impl;

import com.example.weapp.bean.SysGood;
import com.example.weapp.mapper.SysGoodMapper;
import com.example.weapp.service.SysGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class SysGoodServiceImpl implements SysGoodService {

    @Autowired
    private SysGoodMapper sysGoodMapper;

    @Override
    public List<SysGood> findByGoodInf() {
       // SysUser sysGood = sysGoodMapper.findByGoodName(name);
        return sysGoodMapper.findByGoodName();
    }



    @Override
    public List<SysGood> getGoodList() {
        System.out.println("牛逼牛逼");
        List<SysGood> sysGoods = new ArrayList<>();
        List<SysGood> Goods = findByGoodInf();
        for (SysGood good : Goods) {
            sysGoods.add(good);
        }
        return sysGoods;
    }

    @Override
    public Object addGoodList(SysGood sysGood) {
        sysGoodMapper.insertGoodList(sysGood);
        return null;
    }






}

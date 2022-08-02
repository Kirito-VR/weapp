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

        return sysGoodMapper.findByGoodName();
    }
    @Override
    public List<SysGood> selByGoodInf(String name) {

        return sysGoodMapper.selByGoodName(name);
    }



    @Override
    public Object addGoodList(SysGood sysGood) {
        sysGoodMapper.insertGoodList(sysGood);
        return null;
    }
    @Override
    public Object delGoodList(String id) {
        sysGoodMapper.delectGoodList(id);
        return null;
    }
    @Override
    public Object resGoodList(SysGood sysGood) {
        sysGoodMapper.resioveGoodList(sysGood);
        return null;
    }







}

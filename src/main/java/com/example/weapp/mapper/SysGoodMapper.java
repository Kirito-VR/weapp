package com.example.weapp.mapper;


import com.example.weapp.bean.SysGood;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysGoodMapper {
    //List<SysGood> findByGoodName(@Param(value = "name") String name);
    List<SysGood> findByGoodName();
    void insertGoodList(SysGood sysGood);
    void delectGoodList(String id);
    void resioveGoodList(SysGood sysGood);
    List<SysGood> selByGoodName(String name);

}

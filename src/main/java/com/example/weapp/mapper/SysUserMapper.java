package com.example.weapp.mapper;

import java.util.List;

import com.example.weapp.bean.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @Author Liwei
 * @Date 2021-08-13 17:50
 */
@Mapper
@Service
public interface SysUserMapper {
    SysUser findByName(@Param(value = "name") String name);
}
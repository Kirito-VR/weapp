package com.example.weapp.mapper;

import java.util.List;

import com.example.weapp.bean.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Liwei
 * @Date 2021-08-13 17:50
 */
@Mapper
public interface SysUserRoleMapper {
    List<SysUserRole> findUserRoles(@Param(value = "userId") Long userId);
}
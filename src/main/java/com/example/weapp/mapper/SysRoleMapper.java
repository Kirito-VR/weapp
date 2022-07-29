package com.example.weapp.mapper;

import java.util.List;

import com.example.weapp.bean.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @Author Liwei
 * @Date 2021-08-13 17:50
 */
@Mapper
@Service
public interface SysRoleMapper {
    SysRole selectByPrimaryKey(Long id);
    List<SysRole> findAll();
}
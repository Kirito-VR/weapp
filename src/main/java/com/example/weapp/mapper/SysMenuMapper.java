package com.example.weapp.mapper;

import java.util.List;
import com.example.weapp.bean.SysMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
//import org.springframework.context.annotation.Bean;

/**
 * @Author Liwei
 * @Date 2021-08-13 17:50
 */
@Mapper
@Service
public interface SysMenuMapper {
    List<SysMenu> findAll();

    List<SysMenu> findByUserName(@Param(value = "userName") String userName);
}

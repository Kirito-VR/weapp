package com.example.weapp.mapper;

import com.example.weapp.bean.Cart;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @Author Liwei
 * @Date 2021-08-13 17:50
 */
@Mapper
public interface SysCartMapper {

    List <Cart> getCartList();

    boolean AddCart(Cart cart);
    boolean DeleteCart(Cart cart);

}

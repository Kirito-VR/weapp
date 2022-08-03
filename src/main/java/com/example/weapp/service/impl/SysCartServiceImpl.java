package com.example.weapp.service.impl;

import com.example.weapp.bean.Cart;

import com.example.weapp.bean.User;
import com.example.weapp.mapper.SysCartMapper;
import com.example.weapp.service.SysCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysCartServiceImpl implements SysCartService {

    @Autowired
    private SysCartMapper SysCartMapper;


    @Override
    public List<Cart> getCartList() {
        List<Cart> cartList=null;
        cartList=SysCartMapper.getCartList();
        return cartList;
    }

    @Override
    public boolean AddCart(Cart cart){
        boolean addCartResult;
        System.out.println("调用了Service");
        addCartResult= SysCartMapper.AddCart(cart);
        return addCartResult;
    }

    @Override
    public boolean DeleteCart(Cart cart){
        boolean deleteCartResult;
        System.out.println("调用了Service");
        deleteCartResult= SysCartMapper.DeleteCart(cart);
        return deleteCartResult;
    }
}





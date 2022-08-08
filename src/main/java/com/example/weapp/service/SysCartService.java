package com.example.weapp.service;

import com.example.weapp.bean.Cart;


import java.util.List;

public interface SysCartService {

    List<Cart> getCartList();

  boolean AddCart(Cart cart);

  boolean DeleteCart(Cart cart);




}

package com.example.weapp.mapper;

import com.example.weapp.bean.OrderGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderGoodsMapper {

    List<OrderGoods> getOrderGoodsList(String id);
}

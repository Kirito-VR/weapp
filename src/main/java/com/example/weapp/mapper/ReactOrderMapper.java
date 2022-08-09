package com.example.weapp.mapper;
import com.example.weapp.bean.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface ReactOrderMapper {

    List<Order> getOrderListById(int user_id);
    boolean InOrder(Order order);
    boolean DeOrder(Order order);
    boolean MoOrder(Order order);
}

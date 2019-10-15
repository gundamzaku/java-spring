package com.tantanwen.mybatissharding.service.impl;


import com.tantanwen.mybatissharding.entity.Order;
import com.tantanwen.mybatissharding.mapper.OrderMapper;
import com.tantanwen.mybatissharding.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl<T> implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> selectAll() {
        Order order = new Order();
        order.setOrderId(1l);
        orderMapper.select(order);
        return orderMapper.selectAll();
    }

    @Override
    public List<Order> selectMore() {
        return orderMapper.selectMore();
    }
}

package com.tantanwen.mybatistk.service.impl;

import com.tantanwen.mybatistk.entity.Order;
import com.tantanwen.mybatistk.mapper.OrderMapper;
import com.tantanwen.mybatistk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl<T> implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> selectList() {
        return orderMapper.selectMore();
        //return orderMapper.selectList();
    }
}

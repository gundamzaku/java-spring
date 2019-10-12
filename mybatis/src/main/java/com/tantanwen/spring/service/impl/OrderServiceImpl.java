package com.tantanwen.spring.service.impl;

import com.tantanwen.spring.entity.Order;
import com.tantanwen.spring.mapper.OrderMapper;
import com.tantanwen.spring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> selectAll() {
        return orderMapper.selectAll();
    }
}

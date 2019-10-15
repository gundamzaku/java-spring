package com.tantanwen.mybatissharding.service;

import com.tantanwen.mybatissharding.entity.Order;

import java.util.List;

public interface OrderService{
    public List<Order> selectAll();
    public List<Order> selectMore();
}

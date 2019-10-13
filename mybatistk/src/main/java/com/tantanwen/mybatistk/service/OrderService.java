package com.tantanwen.mybatistk.service;

import com.tantanwen.mybatistk.entity.Order;

import java.util.List;

public interface OrderService{
    public List<Order> selectList();
}

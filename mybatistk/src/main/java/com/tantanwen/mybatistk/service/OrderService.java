package com.tantanwen.mybatistk.service;

import com.tantanwen.mybatistk.entity.Order;

import java.util.List;

public interface OrderService extends BaseService{
    public List<Order> selectAll();
}

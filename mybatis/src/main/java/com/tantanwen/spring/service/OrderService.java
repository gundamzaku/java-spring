package com.tantanwen.spring.service;

import com.tantanwen.spring.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    public List<Order> selectAll();
}

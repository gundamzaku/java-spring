package com.tantanwen.mybatissharding.controller;


import com.tantanwen.mybatissharding.entity.Order;
import com.tantanwen.mybatissharding.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TanTanWenController {

    private static final String template = "Hello,Boy, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrderList")
    public List<Order> getOrderAll() {
        List<Order> res = orderService.selectAll();
        return res;
    }

    @RequestMapping("/getOrderTable")
    public List<Order> getOrderTable() {
        List<Order> res = orderService.selectMore();
        return res;
    }
}
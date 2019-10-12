package com.tantanwen.mybatistk.controller;

import com.tantanwen.mybatistk.entity.Order;
import com.tantanwen.mybatistk.service.OrderService;
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

    @RequestMapping("/getOrderAll")
    public List<Order> getOrderAll() {
        return orderService.selectAll();
    }

    /*
       @RequestMapping("/greetingList")
       public ResultMessage<List<User>> greetingList(@RequestParam(value="name", defaultValue="World") String name) {

           //PageHelper.startPage(1, 10);
           List<User> list = userService.SelAll();
           return ResultMessage.success(list);
       }*/
}
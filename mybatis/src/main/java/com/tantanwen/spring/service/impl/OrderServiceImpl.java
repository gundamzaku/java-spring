package com.tantanwen.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        PageHelper.startPage(1, 10);
        List res = orderMapper.selectAll();

        PageInfo<Order> pageInfo = new PageInfo<Order>(res);

        long total = pageInfo.getTotal(); //获取总记录数
        System.out.println(total);
        return res;
    }
}

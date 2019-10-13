package com.tantanwen.mybatistk.mapper;

import com.tantanwen.mybatistk.entity.Order;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface OrderMapper<T> extends Mapper<Order> {
    List<T> selectMore();
}

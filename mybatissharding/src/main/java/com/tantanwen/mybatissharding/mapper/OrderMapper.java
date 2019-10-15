package com.tantanwen.mybatissharding.mapper;

import com.tantanwen.mybatissharding.entity.Order;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface OrderMapper<T> extends Mapper<Order> {
    List<T> selectMore();
}

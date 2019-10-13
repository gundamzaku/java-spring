package com.tantanwen.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper<T> extends Mapper {
    /**
     * select all.
     * @return list of entity
     */
    List<T> selectAll();
    List<T> selectMore();
}

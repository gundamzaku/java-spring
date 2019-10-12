package com.tantanwen.mybatistk.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface OrderMapper<T> extends Mapper {
    /**
     * select all.
     * @return list of entity
     */
    List<T> selectAll();
}

package com.karl.carshop.mapper;

import com.karl.carshop.entity.OrderItem;

public interface OrderItemMapper {

    /**
     * 插入订单中的具体商品
     * @param orderItem 商品条目
     * @return 数据库中受影响行数
     */
    Integer insert(OrderItem orderItem);

}

package com.karl.carshop.mapper;

import com.karl.carshop.entity.Order;
import com.karl.carshop.entity.OrderItem;

import java.util.List;

public interface OrderMapper {

    /**
     * 插入订单
     * @param order 订单数据
     * @return 数据库中受影响的行数
     */
    Integer insert(Order order);



    Integer delete(Integer oid);

    Integer update(Order order);

    List<Order> listOrder();

    Order findOrderByOid(Integer oid);

}

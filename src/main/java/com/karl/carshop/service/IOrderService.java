package com.karl.carshop.service;

import com.karl.carshop.entity.Order;
import com.karl.carshop.entity.OrderItem;

public interface IOrderService {

    /**
     * 插入订单
     * @param order 订单信息
     */
    void insertOrder(Order order);

    /**
     * 插入订单项目
     * @param orderItem  订单中的具体项目
     */
    void insertOrderItem(OrderItem orderItem);

    /**
     * 创建订单
     * @param gid 商品id
     * @param order 订单信息
     */
    void createOrder(Integer gid, Order order);

}

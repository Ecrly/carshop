package com.karl.carshop.service;

import com.karl.carshop.entity.Order;

public interface IOrderService {

    void insertOrder(Integer gid, Order order);

    void insertOrderItem();

}

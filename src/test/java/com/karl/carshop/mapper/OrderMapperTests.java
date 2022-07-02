package com.karl.carshop.mapper;

import com.karl.carshop.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMapperTests {

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Test
    public void insert() {
        Order order = new Order();
        order.setUid(1);
        Integer rows = orderMapper.insert(order);
        if (rows != 1) {
            System.out.println("wrong");
        } else {
            System.out.println("success");
        }
    }

    @Test
    public void listOrder() {
        List<Order> list = new ArrayList<>();
        list = orderMapper.listOrder();
        if (list == null) {
            System.out.println("wrong");
        } else {
            for (Order order: list) {
                System.out.println(order.toString());
            }
        }
    }
}

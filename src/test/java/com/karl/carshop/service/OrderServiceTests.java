package com.karl.carshop.service;

import com.karl.carshop.entity.Order;
import com.karl.carshop.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderServiceTests {

    @Autowired(required = false)
    private IOrderService orderService;

    @Test
    public void createOrder() {
        Integer gid = 1;
        Integer uid = 1;
        Order order = new Order();
        order.setUid(1);
        try {
            orderService.createOrder(1, order);
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

}

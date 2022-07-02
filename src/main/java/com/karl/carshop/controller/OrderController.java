package com.karl.carshop.controller;

import com.karl.carshop.entity.Order;
import com.karl.carshop.service.IOrderService;
import com.karl.carshop.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("orders")
public class OrderController extends BaseController {

    @Autowired(required = false)
    private IOrderService orderService;

    @PostMapping()
    public JsonResult<Void> createOrder(Integer gid, Order order, HttpSession session) {
        Integer uid = getuidFromSession(session);
        String username = getUsernameFromSession(session);
        order.setUid(uid);
        order.setCreatedUser(username);
        order.setModifiedUser(username);
        orderService.createOrder(gid, order);
        return new JsonResult<Void>(200);
    }

}

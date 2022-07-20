package com.karl.carshop.service.impl;

import com.karl.carshop.entity.Goods;
import com.karl.carshop.entity.Order;
import com.karl.carshop.entity.OrderItem;
import com.karl.carshop.mapper.GoodsMapper;
import com.karl.carshop.mapper.OrderItemMapper;
import com.karl.carshop.mapper.OrderMapper;
import com.karl.carshop.service.IOrderService;
import com.karl.carshop.service.ex.GoodsNotFoundException;
import com.karl.carshop.service.ex.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Autowired(required = false)
    private OrderItemMapper orderItemMapper;

    @Autowired(required = false)
    private GoodsMapper goodsMapper;

    private Date now = new Date();

    @Override
    public void insertOrder(Order order) {

        // 补充创建和修改时间
        order.setModifiedTime(now);
        order.setCreatedTime(now);

        Integer rows = orderMapper.insert(order);
        if (rows != 1) {
            throw new InsertException("插入订单时发生异常");
        }

    }

    @Override
    public void insertOrderItem(OrderItem orderItem) {

        // 补充创建和修改时时间
        orderItem.setCreatedTime(now);
        orderItem.setModifiedTime(now);

        Integer rows = orderItemMapper.insert(orderItem);
        if (rows != 1) {
            throw new InsertException("插入订单项时发生问题");
        }
    }

    @Override
    public void createOrder(Integer gid, Order order) {

        // 确保下单的商品合法
        Goods goods = goodsMapper.findGoodsByGid(gid);
        if (goods == null) {
            throw new GoodsNotFoundException("所选商品未找到");
        }

        // 先插入订单
        insertOrder(order);
        System.out.println(order.getOid());

        // 补充订单项信息并插入订单项
        OrderItem orderItem = new OrderItem();
        String username = order.getCreatedUser();
        orderItem.setOid(order.getOid());
        orderItem.setGid(gid);
        orderItem.setPrice(goods.getGoodsPrice());
        orderItem.setNum(1);    // 暂定每次只买一个吧..
        orderItem.setCreatedUser(username);
        orderItem.setModifiedUser(username);
        insertOrderItem(orderItem);

    }
}

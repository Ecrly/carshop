package com.karl.carshop.service;

import com.karl.carshop.entity.Goods;
import com.karl.carshop.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GoodsServiceTests {

    @Autowired(required = false)
    private IGoodsService goodsService;

    @Test
    public void insert() {
        Goods goods = new Goods();
        goods.setGoodsName("service test01");
        try {
            goodsService.insert(goods);
            System.out.println("插入成功");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void update() {
        Integer gid = 2;
        Goods goods = new Goods();
        goods.setGid(gid);
        goods.setGoodsName("sercie new name");
        try {
            goodsService.update(goods);
            System.out.println("修改成功");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void listGoods() {
        try {
            List<Goods> list = goodsService.listGoods();
            for (Goods goods: list) {
                System.out.println(goods.toString());
            }
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

}

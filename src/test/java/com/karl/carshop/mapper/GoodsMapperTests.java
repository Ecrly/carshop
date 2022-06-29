package com.karl.carshop.mapper;

import com.karl.carshop.entity.Goods;
import com.karl.carshop.service.ex.SelectException;
import com.karl.carshop.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GoodsMapperTests {

    @Autowired(required = false)
    private GoodsMapper goodsMapper;

    @Test
    public void insert() {
        Goods goods = new Goods();
        goods.setGoodsName("goods01");
        goods.setGoodsPrice(123.);
        goodsMapper.insert(goods);
        System.out.println("插入成功");

    }

    @Test
    public void delete() {

    }

    @Test
    public void update() {
        Goods goods = new Goods();
        goods.setGid(1);
        goods.setGoodsName("new name ");
        goodsMapper.update(goods);
        System.out.println("更新成功");
    }

    @Test
    public void listGoods() {
        List<Goods> list = goodsMapper.listGoods();
        for (Goods goods: list) {
            System.out.println(goods.toString());
        }
    }

    @Test
    public void findGoodsByGid() {
        Integer gid = 1;
        Goods goods = goodsMapper.findGoodsByGid(gid);
        System.out.println(goods.toString());
    }
}

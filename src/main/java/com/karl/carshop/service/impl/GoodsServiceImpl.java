package com.karl.carshop.service.impl;

import com.karl.carshop.entity.Goods;
import com.karl.carshop.mapper.GoodsMapper;
import com.karl.carshop.service.IGoodsService;
import com.karl.carshop.service.ex.DeleteException;
import com.karl.carshop.service.ex.GoodsNotFoundException;
import com.karl.carshop.service.ex.InsertException;
import com.karl.carshop.service.ex.SelectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired(required = false)
    private GoodsMapper goodsMapper;

    @Override
    public void insert(Goods goods) {
        // 补充创建时间和修改时间
        Date now = new Date();
        goods.setModifiedTime(now);
        goods.setCreatedTime(now);

        Integer rows = goodsMapper.insert(goods);
        if (rows != 1) {
            throw new InsertException("商品插入失败");
        }
    }

    @Override
    public void delete(Integer gid) {
        Goods goods = goodsMapper.findGoodsByGid(gid);
        if (goods == null) {
            throw new GoodsNotFoundException("商品未找到");
        }
        Integer rows = goodsMapper.delete(gid);
        if (rows != 1) {
            throw new DeleteException("商品删除失败");
        }
    }

    @Override
    public void update(Goods goods) {

        // 检查商品是否存在，不存在则无法修改
        Goods record = goodsMapper.findGoodsByGid(goods.getGid());
        if (record == null) {
            throw new GoodsNotFoundException("商品未找到");
        }
        // 补充修改时间
        Date now = new Date();
        goods.setModifiedTime(now);

        Integer rows = goodsMapper.update(goods);
        if (rows != 1) {
            throw new DeleteException("商品删除失败");
        }
    }

    @Override
    public List<Goods> listGoods() {
        List<Goods> goodsList = goodsMapper.listGoods();
        if (goodsList == null) {
            throw new SelectException("查询时发生未知错误");
        }
        return goodsList;
    }

    @Override
    public Goods findGoodsByGid(Integer gid) {
        Goods goods = goodsMapper.findGoodsByGid(gid);
        if (goods == null) {
            throw new GoodsNotFoundException("商品未找到");
        }
        return goods;
    }
}

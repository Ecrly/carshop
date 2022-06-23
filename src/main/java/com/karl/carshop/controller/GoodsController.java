package com.karl.carshop.controller;

import com.karl.carshop.entity.Goods;
import com.karl.carshop.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsMapper goodsMapper;

    @RequestMapping
    public String goodsList(){
        List<Goods> goodsList = goodsMapper.findAll();
        return goodsList.toString();
    }

}

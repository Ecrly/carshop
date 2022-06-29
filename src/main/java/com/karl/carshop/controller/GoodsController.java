package com.karl.carshop.controller;

import com.karl.carshop.entity.Goods;
import com.karl.carshop.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    GoodsMapper goodsMapper;

    @GetMapping("/goods")
    public String goodsList(){
        List<Goods> goodsList = goodsMapper.listGoods();
        StringBuilder sb = new StringBuilder();
        for(Goods goods: goodsList){
            sb.append(goods.toString());
        }
        return goodsList.toString();
    }

    @PostMapping("/goods")
    public String addGoods(Goods goods) throws Exception {
        System.out.println(goods.toString() + "add");
        goodsMapper.insert(goods);
        return "redirect:goods";
    }

    @DeleteMapping("/goods/{gid}")
    public String deleteGoods(Integer gid) throws Exception {
        goodsMapper.delete(gid);
        return "redirect:goods";
    }

    @PutMapping("/goods/{gid}")
    public String updateGoods(Goods goods) throws Exception {
        goodsMapper.update(goods);
        return "redirect:goods";
    }

    @GetMapping("/goods/{gid}")
    public String getGoods(@PathVariable("gid")Integer gid) throws Exception {
        System.out.println(gid);
        Goods goods = goodsMapper.findGoodsByGid(gid);
        System.out.println(goods);
        return goods.toString();
    }

}

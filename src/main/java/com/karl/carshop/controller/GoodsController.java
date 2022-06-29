package com.karl.carshop.controller;

import com.karl.carshop.entity.Goods;
import com.karl.carshop.mapper.GoodsMapper;
import com.karl.carshop.service.IGoodsService;
import com.karl.carshop.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController extends BaseController {

    @Autowired
    IGoodsService goodsService;

    @GetMapping("")
    public JsonResult<List<Goods>> listGoods(){
        List<Goods> goodsList = goodsService.listGoods();
        return new JsonResult<List<Goods>>(200, goodsList);
    }

    @PostMapping("")
    public JsonResult<Void> addGoods(Goods goods, HttpSession session) {

        // 补充操作用户
        String username = getUsernameFromSession(session);
        goods.setCreatedUser(username);
        goods.setModifiedUser(username);

        goodsService.insert(goods);
        return new JsonResult<Void>(200);
    }

    @DeleteMapping("/{gid}")
    public JsonResult<Void> deleteGoods(@PathVariable("gid")Integer gid) {
        goodsService.delete(gid);
        return new JsonResult<Void>(200);
    }

    @PutMapping("/")
    public JsonResult<Void> updateGoods(Goods goods, HttpSession session) {

        // 补充修改者信息
        String username = getUsernameFromSession(session);
        goods.setModifiedUser(username);

        goodsService.update(goods);
        return new JsonResult<Void>(200);
    }

    @GetMapping("/{gid}")
    public JsonResult<Goods> getGoods(@PathVariable("gid")Integer gid) {
        Goods goods = goodsService.findGoodsByGid(gid);
        return new JsonResult<Goods>(200, goods);
    }

}

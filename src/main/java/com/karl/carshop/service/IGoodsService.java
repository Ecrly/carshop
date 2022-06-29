package com.karl.carshop.service;

import com.karl.carshop.entity.Goods;

import java.util.List;

public interface IGoodsService {

    /**
     * 添加商品
     * @param goods 商品信息
     */
    void insert(Goods goods);

    /**
     * 删除商品
     * @param gid 商品id
     */
    void delete(Integer gid);

    /**
     * 更新商品
     * @param goods 商品信息
     */
    void update(Goods goods);

    /**
     * 列举所有商品
     * @return 商品列表
     */
    List<Goods> listGoods();

    /**
     * 查询某商品详细信息
     * @param gid 商品id
     * @return 商品对象即所有信息
     */
    Goods findGoodsByGid(Integer gid);

}

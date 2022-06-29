package com.karl.carshop.mapper;

import java.util.List;
import com.karl.carshop.entity.Goods;
import org.apache.ibatis.annotations.*;

@Mapper
public interface GoodsMapper {


    /**
     * 插入商品
     * @param goods 商品信息
     * @return 数据库中被影响行数
     */
    Integer insert(Goods goods);

    /**
     * 删除商品（此处存疑，是否定义is_delete字段，或者是否直接修改商品状态？）
     * @param gid 商品id
     * @return 数据库中被影响行数
     */
    Integer delete(Integer gid);

    /**
     * 更新商品信息
     * @param goods 商品信息
     * @return 数据库中被影响行数
     */
    Integer update(Goods goods);

    /**
     * 查询所有商品（此处后续需要增加分页功能）
     * @return 商品列表
     */
    List<Goods> listGoods();

    /**
     * 根据gid查询商品详细信息
     * @param gid 商品id
     * @return 商品对象即商品信息
     */
    Goods findGoodsByGid(Integer gid);

}
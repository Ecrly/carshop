package com.karl.carshop.mapper;

import java.util.List;
import com.karl.carshop.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GoodsMapper {

    @Select("select * from c_goods")
    List<Goods> findAll();

}
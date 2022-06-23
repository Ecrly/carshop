package com.karl.carshop.mapper;

import java.util.List;
import com.karl.carshop.entity.Goods;
import org.apache.ibatis.annotations.*;

@Mapper
public interface GoodsMapper {



    @Insert("insert into c_goods (gid, name) values (#{gid}, #{name})")
    int add(Goods goods);

    @Delete("delete from c_goods where gid=#{gid}")
    void delete(Integer id);

    @Update("update c_goods set name = #{name}, main_picture = #{mainPicture}, pictures = #{pictures}," +
            "type = #{type}, goods_price = #{goodsPrice}, cost = #{cost}, stock = #{stock}, " +
            "sales_volume = #{salesVolume}, goods_state = #{goodsState}, details = #{details}, " +
            "created_user = #{createdUser}, created_time = #{createdTime}, modified_user = #{modifiedUser}, " +
            "modified_time = #{modifiedTime} where gid = #{gid}")
    int update(Goods goods);

    @Select("select * from c_goods")
    List<Goods> findAll();

    @Select("select * from c_goods where gid=#{gid}")
    Goods get(Integer gid);

}
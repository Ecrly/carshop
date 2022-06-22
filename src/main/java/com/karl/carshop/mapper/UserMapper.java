package com.karl.carshop.mapper;

import com.karl.carshop.entity.User;

/** 用户模块的持久层接口*/
public interface UserMapper {
    /**
     * 插入用户的数据
     * @param user 用户的数据
     * @return 受影响的行数（增、删、改，都受影响，根据返回值判断是否成功）
     */
    Integer insert(User user);

    /**
     * 根据用户名来查询用户的数据
     * @param username 用户名
     * @return 如果找到，则返回，没找到返回NULL
     */
    User findByUsername(String username);
}

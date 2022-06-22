package com.karl.carshop.service;

import com.karl.carshop.entity.User;

/** 用户模块业务层接口 */
public interface IUserService {
    /**
     * 用户注册方法
     * @param user 用户的数据对象
     */
    void reg(User user);

    /**
     * 用户登录功能
     * @param username 用户名
     * @param password 用户密码
     * @return 匹配成功返回用户数据，失败返回null
     */
    User login(String username,String password);

}

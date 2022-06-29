package com.karl.carshop.service;

import com.karl.carshop.entity.User;
import com.karl.carshop.mapper.UserMapper;
import com.karl.carshop.service.ex.ServiceException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTests {
    @Autowired
    private IUserService userService;
    @Test
    public void reg(){
        try {
            User user = new User();
            user.setUserName("test02");
            user.setPassword("123");
            user.setSex(1);
            user.setUserPhone("66666666666");
            user.setUsercode("6815685818161510628");
            userService.reg(user);
            System.out.println("OK");
        } catch (ServiceException e) {
            // 获取类的对象，在获取类的名称
            System.out.println(e.getClass().getSimpleName());
            //获取异常的具体描述信息
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void login(){
        User user = userService.login("clarkson","66666");
        System.out.println(user);
    }

}

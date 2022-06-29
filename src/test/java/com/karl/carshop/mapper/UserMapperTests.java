package com.karl.carshop.mapper;

import com.karl.carshop.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTests {
    @Autowired(required = false)
    private UserMapper userMapper;
    @Test
    public void insert(){
        User user = new User();
        user.setUserName("karl");
        user.setPassword("66666");
        user.setSex(0);
        user.setUserPhone("18242838511");
        user.setUsercode("68156858181615155574");
        Integer rows = userMapper.insert(user);
        System.out.println(rows);
    }

    @Test
    public void findByUsername(){
        User user = userMapper.findByUsername("karl");
        System.out.println(user);
    }
}

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
        user.setUserName("test01");
        user.setPassword("123");
        user.setSex(0);
        user.setUserPhone("18242838511");
        user.setUsercode("68156858181615155574");
        Integer rows = userMapper.insert(user);
        System.out.println(rows);
    }

    @Test
    public void findByUsername(){
        User user = userMapper.findByUsername("test02");
        System.out.println(user);
    }
}

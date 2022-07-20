package com.karl.carshop.mapper;
import com.karl.carshop.entity.WashOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WashOrderTests {

    @Autowired(required = false)
    WashOrderMapper washOrderMapper;

    @Test
    public void list() {
        List<WashOrder> washOrders = washOrderMapper.selectList(null);
        for (WashOrder washOrder : washOrders) {
            System.out.println(washOrder.toString());
        }
    }
}

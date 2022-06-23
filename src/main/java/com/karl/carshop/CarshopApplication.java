package com.karl.carshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.karl.carshop.mapper")
@SpringBootApplication
public class CarshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarshopApplication.class, args);
    }

}

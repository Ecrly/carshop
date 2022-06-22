package com.karl.carshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.karl.carshop.mapper")
public class CarshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarshopApplication.class, args);
    }

}

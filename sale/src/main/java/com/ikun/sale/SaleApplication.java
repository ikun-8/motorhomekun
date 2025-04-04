package com.ikun.sale;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.ikun.sale.mapper")
@EnableFeignClients
public class SaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaleApplication.class, args);
    }

}

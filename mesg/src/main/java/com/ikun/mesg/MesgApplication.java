package com.ikun.mesg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ikun.mesg.mapper")
public class MesgApplication {

    public static void main(String[] args) {
        SpringApplication.run(MesgApplication.class, args);
    }

}

package com.atldy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atldy.mapper")
public class MallProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProjectApplication.class, args);
    }

}

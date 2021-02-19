package com.atguigu.crowd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu.crowd.mapper")
@SpringBootApplication
public class CrowdMainMySQL {
    public static void main(String[] args) {
        SpringApplication.run(CrowdMainMySQL.class, args);
    }
}

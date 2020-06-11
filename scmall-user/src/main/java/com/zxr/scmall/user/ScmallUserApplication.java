package com.zxr.scmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zxr.scmall.user.mapper")
public class ScmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScmallUserApplication.class, args);
    }

}

package com.chan.flash.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.chan.flash")
@MapperScan("com.chan.flash.mapper")
public class FlashWebApplication {
    public static void main(String[] args) {
        //加上参数args,在执行jar包时才能指定参数
        //如：--spring.profiles.active=prod  --server.port=8888
        SpringApplication.run(FlashWebApplication.class,args);
    }
}

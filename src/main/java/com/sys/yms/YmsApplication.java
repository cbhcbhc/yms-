package com.sys.yms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan(basePackages = {"com.sys.yms.mapper"})
public class YmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmsApplication.class, args);
    }

}

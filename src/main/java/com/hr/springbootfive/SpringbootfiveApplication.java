package com.hr.springbootfive;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hr.springbootfive.dao")
public class SpringbootfiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootfiveApplication.class, args);
    }

}

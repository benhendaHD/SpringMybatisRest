package com.hafedh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.hafedh.mappers")
@Configuration
public class SpringRestMyBatisDemoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SpringRestMyBatisDemoApplication.class, args);
    }

}

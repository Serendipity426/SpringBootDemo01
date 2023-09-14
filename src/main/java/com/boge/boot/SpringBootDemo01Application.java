package com.boge.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @SpringBootApplication:是一个
 * @SpringBootConfiguration： @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan
 */
@SpringBootApplication
public class SpringBootDemo01Application {

    public static void main(String[] args) {
        // 本质上其实就是完成了Spring容器的初始化操作
        ApplicationContext run = SpringApplication.run(SpringBootDemo01Application.class, args);
    }

}

package com.wance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource(value = "classpath:stu.properties",encoding = "utf-8") //创建该bean时，读取配置文件
public class Day2SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day2SpringbootApplication.class, args);
    }

}

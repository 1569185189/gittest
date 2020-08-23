package com.wance.app;

import com.wance.config.EnableA;
import com.wance.config.EnableAnimal;
import com.wance.config.MyAAutoConfig;
import com.wance.config.MyAnimalAutoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//自定义启动类
@SpringBootApplication
//@EnableA
//@EnableAnimal
@Import(value = {MyAAutoConfig.class, MyAnimalAutoConfig.class})    //创建并导入自动配置类
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }
}

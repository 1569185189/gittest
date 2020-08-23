package com.wance.config;

import com.wance.entity.A;
import com.wance.entity.AProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//完成对类A bean的自动化配置
@Configuration
@ConditionalOnClass(A.class)    //只有项目有类A定义的情况下，该配置类才会被创建
@EnableConfigurationProperties(AProperties.class)   //指定默认属性文件
public class MyAAutoConfig {
    private AProperties properties; //属性文件

    //必须在构造时，传入属性文件对象

    public MyAAutoConfig(AProperties properties) {
        this.properties = properties;
    }
    @Bean   //当spring工厂，不存在A对象时，调用其创建1个类A的对象
    @ConditionalOnMissingBean(A.class)
    public A createWhenNoBean(){
        A a = new A();
        a.setNumber(properties.getNumber());
        a.setVersion(properties.getVersion());
        return a;
    }
}

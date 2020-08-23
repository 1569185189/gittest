package com.wance.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//把类A 的自动化配置激活
@Target(ElementType.TYPE)   //该注解用在类声明上
@Retention(RetentionPolicy.RUNTIME) //有效期保留到运行时
@Import(MyAAutoConfig.class)    //创建并导入自动配置类
public @interface EnableA {
}

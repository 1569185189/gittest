package com.wance.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

//配置初始化类A的默认属性值
@ConfigurationProperties(prefix = "com.wance.a")    //会被覆盖的属性前缀
public class AProperties {
    private String version = "v0.0.1";
    private int number = 1;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

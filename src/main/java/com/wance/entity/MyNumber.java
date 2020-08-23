package com.wance.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.number")
public class MyNumber {
    private String a;
    private int b;
    private int c;
    private String uuid;
    private String myfriend;

    public String getMyfriend() {
        return myfriend;
    }

    public void setMyfriend(String myfriend) {
        this.myfriend = myfriend;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "a='" + a + '\'' +
                ", b=" + b +
                ", c=" + c +
                ", uuid='" + uuid + '\'' +
                ", myfriend='" + myfriend + '\'' +
                '}';
    }
}

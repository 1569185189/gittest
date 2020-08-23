package com.wance.entity;

public class A {
    private String version;
    private int number;

    public A() {
    }

    public A(String version, int number) {
        this.version = version;
        this.number = number;
    }

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

    @Override
    public String toString() {
        return "A{" +
                "version='" + version + '\'' +
                ", number=" + number +
                '}';
    }
}

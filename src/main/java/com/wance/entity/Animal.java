package com.wance.entity;

public class Animal {
    private int aid;
    private String aname;
    private String sex;
    private int feetcount;
    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Animal() {
    }

    public Animal(int aid, String aname, String sex, int feetcount) {
        this.aid = aid;
        this.aname = aname;
        this.sex = sex;
        this.feetcount = feetcount;
    }

    public Animal(int aid, String aname, String sex, int feetcount, Owner owner) {
        this.aid = aid;
        this.aname = aname;
        this.sex = sex;
        this.feetcount = feetcount;
        this.owner = owner;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getFeetcount() {
        return feetcount;
    }

    public void setFeetcount(int feetcount) {
        this.feetcount = feetcount;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", sex='" + sex + '\'' +
                ", feetcount=" + feetcount +
                ", owner=" + owner +
                '}';
    }
}

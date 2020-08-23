package com.wance.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.wanc.animal")
public class AnimalProperties {
    private int aid = 1;
    private String aname = "狗";
    private String sex = "男";
    private int feetcount = 4;
    private String ownername = "男1";

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
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

}

package com.wance.entity;

import org.springframework.beans.factory.annotation.Value;

public class Owner {
    //@Value("${com.wance.owner.oname}")
    private String oname;
    private Animal animal;

    public Owner() {
    }

    public Owner(String oname, Animal animal) {
        this.oname = oname;
        this.animal = animal;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "oname='" + oname + '\'' +
                ", animal=" + animal +
                '}';
    }
}

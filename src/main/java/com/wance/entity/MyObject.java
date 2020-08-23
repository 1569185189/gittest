package com.wance.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix="myobject")
public class MyObject {
    //@Value("${myobject.name}")
    private String name;
    //@Value("${myobject.age}")
    private int age;
    //@Value("${myobject.price}")
    private float price;
    private String[] booknames;
    private Map<String,String> friends;
    private Student student;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String[] getBooknames() {
        return booknames;
    }

    public void setBooknames(String[] booknames) {
        this.booknames = booknames;
    }

    public Map<String, String> getFriends() {
        return friends;
    }

    public void setFriends(Map<String, String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", booknames=" + Arrays.toString(booknames) +
                ", friends=" + friends +
                ", student=" + student +
                ", students=" + students +
                '}';
    }
}

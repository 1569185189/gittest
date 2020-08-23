package com.wance.day2_springboot;

import com.wance.Day2SpringbootApplication;
import com.wance.entity.A;
import com.wance.entity.MyNumber;
import com.wance.entity.MyObject;
import com.wance.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Day2SpringbootApplication.class})
class Day2SpringbootApplicationTests {

    @Autowired
    private MyNumber number;
    @Autowired
    private MyObject object;
    @Autowired
    private Student student;
    @Autowired
    private A a;
    @Test
    void contextLoads() {
        System.out.println(number);
    }

    @Test
    void testXML(){
        System.out.println(object);
    }

    @Test
    void testStudent(){
        System.out.println(student);
    }

    @Test
    void testAutoConfigA(){
        System.out.println(a);
    }
}

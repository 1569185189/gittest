package com.wance.day2_springboot;

import com.wance.app.MyApplication;
import com.wance.entity.A;
import com.wance.entity.Animal;
import com.wance.entity.Owner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MyApplication.class})
public class MyApplicationTest {
    @Autowired
    private A a;
    @Autowired
    private Animal animal;
    @Autowired
    private Owner owner;
    @Test
    public void testAutoConfigA(){
        //报错，a无法完成自动配置
        System.out.println(a);
    }
    @Test
    public void testAutoConfigAnimal(){
        System.out.println(animal);
    }
    @Test
    public void testAutoConfigAnimal2(){
        System.out.println(animal);
        System.out.println(owner);
    }
}

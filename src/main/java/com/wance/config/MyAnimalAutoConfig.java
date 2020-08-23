package com.wance.config;

import com.wance.entity.Animal;
import com.wance.entity.AnimalProperties;
import com.wance.entity.Owner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Animal.class)
@EnableConfigurationProperties(AnimalProperties.class)
public class MyAnimalAutoConfig {
    private AnimalProperties properties;

    public MyAnimalAutoConfig(AnimalProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(Animal.class)
    public Animal getAnimal(){
        Animal animal = new Animal(properties.getAid(),properties.getAname(),properties.getSex(),properties.getFeetcount());
        return animal;
    }

    @Bean   //创建1个该动物的主人
    @ConditionalOnBean(Animal.class) //只有springIOC容器中有animal对象时，才创建owner对象
    @ConditionalOnProperty(name="mycfg.createowner.enabled",havingValue="true")
    public Owner createWithAnimal(Animal animal){
        Owner owner = new Owner();
        if(properties.getOwnername()==null){

        }
        owner.setOname(animal.getAname()+"的主人");
        owner.setAnimal(animal);
        return owner;
    }
}

package com.fzy.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Ren {
    private String name;
//    使用注解就会自动装配 也可以直接放在set方法上面  是使用l类型匹配
    @Autowired
//    这个的意思是使用name装配
    @Qualifier(value = "dog")
    private Dog dog;
//    这个注解是java自带的，不是spring的，也可以自动装配
    @Resource
    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}

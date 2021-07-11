package com.fzy.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//使用这个注解就能自动创建
@Component
public class SysUser {
//    使用注解注入属性
    @Value("付志远")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "name='" + name + '\'' +
                '}';
    }
}

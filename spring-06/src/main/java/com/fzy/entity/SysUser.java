package com.fzy.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SysUser {
    private String name;

    public String getName() {
        return name;
    }
    @Value("付志远")
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

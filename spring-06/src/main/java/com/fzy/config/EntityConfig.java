package com.fzy.config;

import com.fzy.entity.SysUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//使这个类变成配置类
@Configuration
//扫描包
@ComponentScan("com.fzy.entity")
public class EntityConfig {
//    使用配置文件创建bean
    @Bean
    public SysUser getUser(){
        return new SysUser();
    }
}

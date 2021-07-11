package com.fzy.controller;

import com.fzy.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//Controller层用的注解，自动创建bean 和@Component是一样的
@Controller
public class SysUserContorller {
    @Autowired
    private SysUserService sysUserService;
//    不用get和set也可以自动装配，使用的构造方法装配
    public SysUserService getSysUserService() {
        return sysUserService;
    }

    public void setSysUserService(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }
}

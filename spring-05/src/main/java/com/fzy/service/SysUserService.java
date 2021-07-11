package com.fzy.service;

import com.fzy.dao.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Service层用的注解，自动创建bean 和@Component是一样的
@Service
public class SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    public SysUserDao getSysUserDao() {
        return sysUserDao;
    }

    public void setSysUserDao(SysUserDao sysUserDao) {
        this.sysUserDao = sysUserDao;
    }
}

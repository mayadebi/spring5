package com.fzy.dao;

import com.fzy.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//dao层用的注解，自动创建bean 和@Component是一样的
@Repository
public class SysUserDao {
    @Autowired
    private SysUser sysUser;

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }
}

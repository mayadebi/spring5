package com.fzy.service;

import com.fzy.dao.SysUserDaoImpl;

public class SysUserServiceImpl {
    private SysUserDaoImpl sysUserDao;
    public void getUser(){
        sysUserDao.getUser();
    }

    public SysUserDaoImpl getSysUserDao() {
        return sysUserDao;
    }

    public void setSysUserDao(SysUserDaoImpl sysUserDao) {
        this.sysUserDao = sysUserDao;
    }
}

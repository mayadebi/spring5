package com.fzy.service;

import com.fzy.dao.SysUserMapper;
import com.fzy.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService{
    @Autowired
    private SysUserMapper sysUserMapper;
    @Transactional
    public void shiwu() {
        SysUser sysUser = new SysUser(0,"ffff","kkkkk");
        sysUserMapper.addUser(sysUser);
        sysUserMapper.delUser(13);
    }
}

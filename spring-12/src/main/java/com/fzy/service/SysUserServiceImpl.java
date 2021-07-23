package com.fzy.service;

import com.fzy.dao.SysUserMapper;
import com.fzy.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysUserServiceImpl implements SysUserService{
    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUser> getUserListAll() {
        return sysUserMapper.getUserListAll();
    }
}

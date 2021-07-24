package com.fzy.dao;

import com.fzy.entity.SysUser;

import java.util.List;

public interface SysUserMapper {
    // 查询全部用户
    List<SysUser> getUserListAll();

    int addUser(SysUser sysUser);

    int delUser(int pkid);
}

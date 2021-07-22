package com.fzy.dao;

import com.fzy.entity.SysUser;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysUserMapperImpl extends SqlSessionDaoSupport implements SysUserMapper{
    public List<SysUser> getUserListAll(){
        SysUserMapper mapper = getSqlSession().getMapper(SysUserMapper.class);
        return mapper.getUserListAll();
    }
}

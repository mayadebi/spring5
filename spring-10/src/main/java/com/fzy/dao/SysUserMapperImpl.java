package com.fzy.dao;

import com.fzy.entity.SysUser;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysUserMapperImpl {
    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<SysUser> getUserListAll(){
        SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
        return mapper.getUserListAll();
    }
}

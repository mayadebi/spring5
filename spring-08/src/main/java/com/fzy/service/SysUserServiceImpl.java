package com.fzy.service;

import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    public void add() {
        System.out.println("运行了add方法");
    }

    public void delete() {
        System.out.println("运行了delete方法");
    }

    public void update() {
        System.out.println("运行了update方法");
    }

    public void select() {
        System.out.println("运行了select方法");
    }
}

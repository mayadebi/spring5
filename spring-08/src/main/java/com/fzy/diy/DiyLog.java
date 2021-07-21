package com.fzy.diy;

import org.springframework.stereotype.Component;
//自定义切入类
@Component
public class DiyLog {
    public void kaishi(){
        System.out.println("方法执行前");
    }
    public void jieshu(){
        System.out.println("方法执行后");
    }
}

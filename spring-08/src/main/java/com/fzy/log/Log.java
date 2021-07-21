package com.fzy.log;


import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Component
public class Log implements MethodBeforeAdvice, AfterReturningAdvice {
//    method 要执行的目标对象方法
//    objects 参数
//    o 目标对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("方法执行前"+o.getClass().getName()+"的"+method.getName());
    }

//    o 返回值
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法，返回值是"+o);
    }
}

package com.fzy.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect  //标志这个类是一个切面
@Component
public class Log  {
    @Before("execution(* com.fzy.service.*.*(..))")
    public void kaishi(){
        System.out.println("方法执行前");
    }
    @After("execution(* com.fzy.service.*.*(..))")
    public void jieshu(){
        System.out.println("方法执行后");
    }
//    环绕执行可以给一些参数  代表要切入的点
    @Around("execution(* com.fzy.service.*.*(..))")
    public void qianhou(ProceedingJoinPoint jp){
        System.out.println("环绕前");
        try {
            // 方法继续执行  不写就会停止
            jp.proceed();
            System.out.println("方法的信息"+jp.getSignature().toString()); // 获取签名就是这个信息
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后");
    }
}

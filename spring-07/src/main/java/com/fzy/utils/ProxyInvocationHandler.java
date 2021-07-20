package com.fzy.utils;

import com.fzy.dao.SysUserDao;
import com.fzy.dao.SysUserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 动态代理工具类
//主要是用来给方法前后添加方法
//使用的java代码实现

public class ProxyInvocationHandler implements InvocationHandler {

//    被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void Log(String msg){
        System.out.println("执行了"+msg+"方法!");
    }

    public static void main(String[] args) {
//        真实角色
        SysUserDaoImpl sysUserDaoImpl = new SysUserDaoImpl();
        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置要代理的对象
        pih.setTarget(sysUserDaoImpl);
        //动态生成代理类
        SysUserDao sysUserDao = (SysUserDao)pih.getProxy();

        sysUserDao.add();

    }
}

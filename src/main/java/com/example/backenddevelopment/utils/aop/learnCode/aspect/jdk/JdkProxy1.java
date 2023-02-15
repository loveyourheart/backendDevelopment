package com.example.backenddevelopment.utils.aop.learnCode.aspect.jdk;

import com.example.backenddevelopment.utils.aop.learnCode.aspect.jdk.domain.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy1 implements InvocationHandler {
    private UserDao userDao;
    public Object createProxy(UserDao userDao){
        this.userDao=userDao;
        ClassLoader classLoader = JdkProxy1.class.getClassLoader();
        Class[] clazz = userDao.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader,clazz,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      //声明切面
        MyAspect myAspect = new MyAspect();
        //前增强
        myAspect.check_Permission();
        //在目标类上调用方法，并传入参数
        Object obj = method.invoke(userDao,args);
        //后增强
        myAspect.log();
        return obj;
    }
}

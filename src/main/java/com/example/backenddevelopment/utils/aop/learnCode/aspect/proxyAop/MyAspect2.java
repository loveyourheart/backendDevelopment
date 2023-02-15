package com.example.backenddevelopment.utils.aop.learnCode.aspect.proxyAop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect2 implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        check_Permission();

        Object obj = invocation.proceed();
        log();
       return obj;

    }

    public void check_Permission(){
        System.out.println("模拟检查日志……");
    }

    public  void log(){
        System.out.println("模拟记录日志……");
    }
}

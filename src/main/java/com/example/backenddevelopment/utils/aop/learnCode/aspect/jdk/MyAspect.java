package com.example.backenddevelopment.utils.aop.learnCode.aspect.jdk;

import org.springframework.stereotype.Component;

@Component
public class MyAspect {
    public void check_Permission(){
        System.out.println("模拟检查日志……");
    }

    public  void log(){
        System.out.println("模拟记录日志……");
    }
}

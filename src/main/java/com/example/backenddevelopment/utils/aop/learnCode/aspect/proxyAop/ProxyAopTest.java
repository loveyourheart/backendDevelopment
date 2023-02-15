package com.example.backenddevelopment.utils.aop.learnCode.aspect.proxyAop;


import com.example.backenddevelopment.utils.aop.learnCode.aspect.cglib.CglibProxy;
import com.example.backenddevelopment.utils.aop.learnCode.aspect.cglib.UserDao2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.applet.AppletContext;
//
@Component
public class ProxyAopTest {
    public  void test(){
        Integer b=new Integer(4);
        change((Integer) b);
        System.out.println(b.toString());
    }
    public void change(Integer a){
        a=new Integer(6);
    }







}

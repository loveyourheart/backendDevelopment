package com.example.backenddevelopment.utils.aop.learnCode.aspect.cglib;


import org.springframework.stereotype.Component;

@Component
public class CglibTest {
    public void test(){
        CglibProxy cglibProxy = new CglibProxy();
        UserDao2 userDao2 = new UserDao2();
        UserDao2 userDao1 = (UserDao2) cglibProxy.createProxy(userDao2);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}

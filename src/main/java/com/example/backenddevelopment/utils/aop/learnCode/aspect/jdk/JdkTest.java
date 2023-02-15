package com.example.backenddevelopment.utils.aop.learnCode.aspect.jdk;

import com.example.backenddevelopment.utils.aop.learnCode.aspect.jdk.domain.UserDao;
import com.example.backenddevelopment.utils.aop.learnCode.aspect.jdk.domain.impl.UserDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class JdkTest {
    public void test(){
        JdkProxy1 jdkProxy1 = new JdkProxy1();
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) jdkProxy1.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}

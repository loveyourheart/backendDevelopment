package com.example.backenddevelopment.utils.aop.learnCode.aspect.jdk.domain.impl;

import com.example.backenddevelopment.utils.aop.learnCode.aspect.jdk.domain.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl  implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}

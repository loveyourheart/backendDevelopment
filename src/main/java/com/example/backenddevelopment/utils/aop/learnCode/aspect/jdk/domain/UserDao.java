package com.example.backenddevelopment.utils.aop.learnCode.aspect.jdk.domain;

import org.springframework.stereotype.Component;

@Component
public interface UserDao {
    public void addUser();
    public void deleteUser();
}

package com.example.backenddevelopment.service;

import com.example.backenddevelopment.domain.impl.User;
import com.example.backenddevelopment.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int addUser(User user){
        return userMapper.addUser(user);
    }
    public int login(User user){
        User usert = new User();
        usert =userMapper.getUserById(user.getId());
        if(usert.getPassword().equals(user.getPassword())){
            return 1;
        }else {
            return 0;
        }
    }
    public User loginUser(User user){

        return userMapper.getUserById(user.getId());

    }
}

package com.example.backenddevelopment.mapper;

import com.example.backenddevelopment.daoimp.User;
import org.apache.ibatis.annotations.Mapper;

import javax.jws.soap.SOAPBinding;
@Mapper
public interface UserMapper {
    int addUser(User user);
    User getUserById(Integer id);
}

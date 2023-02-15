package com.example.backenddevelopment.dao.mapper;

import com.example.backenddevelopment.domain.impl.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int addUser(User user);
    User getUserById(Integer id);
}

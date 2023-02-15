package com.example.backenddevelopment.controller;

import com.example.backenddevelopment.domain.impl.User;
import com.example.backenddevelopment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
   @GetMapping("/register")
    public User register(User user){

       userService.addUser(user);
       user.setId(user.getId());
       System.out.println(user.toString());

       return  user;
   }
   @GetMapping("/login")
   public  int login(User user){
       return  userService.login(user);
   }
    @GetMapping("/loginUser")
    public User loginUser(User user){
       user = userService.loginUser(user);
       user.setPassword("");
        return  user;
    }
}

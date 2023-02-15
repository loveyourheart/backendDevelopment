package com.example.backenddevelopment.controller.thread;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class thread1 {
    @RequestMapping("/hello")
    public String printwords(){
        return "I am fine";
    }
}

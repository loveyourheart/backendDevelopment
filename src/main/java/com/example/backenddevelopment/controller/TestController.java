package com.example.backenddevelopment.controller;

import com.example.backenddevelopment.utils.Excel.poi.Test.output.PoiTest;
import com.example.backenddevelopment.utils.aop.learnCode.aspect.cglib.CglibProxy;
import com.example.backenddevelopment.utils.aop.learnCode.aspect.cglib.CglibTest;
import com.example.backenddevelopment.utils.aop.learnCode.aspect.jdk.JdkTest;
import com.example.backenddevelopment.utils.aop.learnCode.aspect.proxyAop.ProxyAopTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {
    @Autowired
    public ProxyAopTest cglibTest;
    @GetMapping("/test")
    public void test(){
        cglibTest.test();
    }
}

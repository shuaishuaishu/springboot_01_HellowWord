package com.czxy.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
    @RequestMapping("/hello")
    public  String  handle01(){
        return "Hellow,Spring Boot 2!";
    }
}

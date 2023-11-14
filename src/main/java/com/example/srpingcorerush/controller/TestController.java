package com.example.srpingcorerush.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public String getMessage(){
        System.out.println("执行get方法");
        return "hello world";
    }

}

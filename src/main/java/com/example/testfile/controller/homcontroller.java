package com.example.testfile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homcontroller {

    @RequestMapping("/hello")
    public String test (){
        return "test1234 파일입니다.";
    }
}

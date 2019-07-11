package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test() {
        return userService.getUser("lisi").toString();
    }

    @RequestMapping("/test1")
    public String test1() {
        return "test1";
    }
}

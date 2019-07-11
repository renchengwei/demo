package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements CommandLineRunner {


    @Value("${my.secret}")
    private String random;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(random);
        new Thread(() -> System.out.println());
    }
}

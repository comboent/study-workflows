package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/say/{name}")
    public String sayHello(String name) {
        return "Hello " + name + " now time is " + new Date();
    }
}

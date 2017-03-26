package com.yl.springboot.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        int[][] array={{1,1},{1,1}};
        return "Greetings from Spring Boot!";
    }

}
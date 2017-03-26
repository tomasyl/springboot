package com.yl.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @RequestMapping("/city")
    public String index() {
        int[][] array={{1,1},{1,1}};
        return "Greetings from Spring Boot!";
    }

}
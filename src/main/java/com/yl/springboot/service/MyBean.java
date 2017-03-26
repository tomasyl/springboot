package com.yl.springboot.service;

import org.springframework.boot.*;
import org.springframework.stereotype.*;

@Component
public class MyBean implements CommandLineRunner {

    public void run(String... args) {
        System.out.println("********MyBean*******");
    }

}
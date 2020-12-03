package com.atom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping(value = "/hello")
    public String getHello(String name){
        return "周杰伦nb！";
    }

}

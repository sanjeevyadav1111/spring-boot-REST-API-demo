package com.arc.arc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class funrestcontroller {
    @GetMapping("/")
    public  String sayhello(){
        return  "helow world";
    }
}

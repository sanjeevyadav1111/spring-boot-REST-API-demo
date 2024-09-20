package com.arc.arc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class funrestcontroller {
    @GetMapping("/")
    public  String sayhello(){
        return  "helow world";
    }
    @GetMapping("/workout")
    public  String getdailyworkout(){
        return  "run a hard ";
    }
    @GetMapping("/fortune")
    public  String getdailyfortune(){
        return  "today is your lucky day";
    }
}

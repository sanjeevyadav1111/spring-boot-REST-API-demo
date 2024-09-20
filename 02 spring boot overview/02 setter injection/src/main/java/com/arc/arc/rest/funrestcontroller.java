package com.arc.arc.rest;

import com.arc.arc.common.coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class funrestcontroller {
    @Value("${admin.name}")
    private  String adminName;
    @Value("${client.name}")

    private  String clientname;
    @GetMapping("/teaminfo")
    public String getteaminfo(){
        return  "adminName:"+adminName+" ,clientName:"+clientname;
    }
    @GetMapping("/")
    public  String sayhello(){
        return  "helow ashutosh";
    }
    @GetMapping("/workout")
    public  String getdailyworkout(){
        return  "run a hard ";
    }
    @GetMapping("/fortune")
    public  String getdailyfortune(){
        return  "today is your lucky day";
    }
    //dependencies injection
    private coach mycoach;
   @Autowired
   public void setmycoach(coach thecoach){
       mycoach=thecoach;
   }
    @GetMapping("/dailyworkout")
    public  String  getworkout(){
        return  mycoach.getworkout();
    }
}

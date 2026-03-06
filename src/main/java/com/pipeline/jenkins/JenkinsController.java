package com.pipeline.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {

    @GetMapping("welcome")
    public String welcome(){

        return "Welcome to jenkins user Bharath";
    }
     //added comment for maven
    // waste
    //test3
    @GetMapping("hello")
    public  String hello(){
        return "hello Bharath.i am jenkins how can i help you";
    }
}

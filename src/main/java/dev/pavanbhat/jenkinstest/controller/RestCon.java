package dev.pavanbhat.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkinstest")
public class RestCon {


    @GetMapping("/sayhello")
    public String sayHello(){
        return "The end point works as expected";
    }

    @GetMapping("/sayhello2")
    public String sayHello2(){
        return "The end point hello world 2 works as expected";
    }
}

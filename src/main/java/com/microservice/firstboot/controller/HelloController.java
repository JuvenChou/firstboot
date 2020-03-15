package com.microservice.firstboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
//@EnableAutoConfiguration
@RequestMapping("/firstboot")
public class HelloController {

    @RequestMapping(value="/sayhello",method= RequestMethod.GET)
    private String index(){
        return "Hello World!";
    }
}

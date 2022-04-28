package com.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FunRestController {

    // exposo "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on server is " + LocalDate.now();
    }
}

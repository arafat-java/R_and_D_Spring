package com.arafat.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldSpringBoot {

    @RequestMapping("/hw") 
    String helloWorld() {		// Invoke using http://localhost:8080/hw
    	
        return "!!! Hello World !!!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorldSpringBoot.class, args);
    }

}
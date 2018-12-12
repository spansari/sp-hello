package com.mtech.sanjiv.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloWorldController {


    @Value("${spring.datasource.username}")
    private String dbUser;

    @RequestMapping("/hello")
   public String sayHello() {
       return "Hello from Service Version 2.22222222 : "+dbUser;
   }

   @PostMapping("msg")
   public String message(@Valid @RequestBody String msgValue) {
      return "{'masg': 'hello world'}";
   }
}

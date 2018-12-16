package com.mtech.sanjiv.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RefreshScope
public class HelloWorldController {


    @Value("${app.greet.name}")
    private String name;

    @RequestMapping("/hello")
   public String sayHello() {
       return "Hello from Service Version 2.22222222 : "+name;
   }

    @Value("${spring.datasource.username}")
    private String dbUser;

    @RequestMapping("/hellodb")
    public String sayHelloDb() {
        return "Hello from DB User : "+dbUser;
    }


    @PostMapping("msg")
   public String message(@Valid @RequestBody String msgValue) {
      return "{'masg': 'hello world'}";
   }
}

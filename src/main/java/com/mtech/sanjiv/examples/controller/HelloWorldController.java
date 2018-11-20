package com.mtech.sanjiv.examples.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
   @RequestMapping("/hello")
   public String sayHello() {
      return "Hello from Service Version 2.22222222";
   }
}

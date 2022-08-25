package com.restapi.hellomessagingapp.controller;

import com.restapi.hellomessagingapp.model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloMessageController {
    private  static final  String template = "Hello , %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public Hello getHello(){
        return new Hello(counter.incrementAndGet(),String.format(template, " "));
    }
}

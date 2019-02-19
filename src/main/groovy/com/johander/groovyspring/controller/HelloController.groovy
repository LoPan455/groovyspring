package com.johander.groovyspring.controller

import jdk.nashorn.internal.ir.annotations.Reference
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {


    @GetMapping("/")
    String hello(){
        "Hello from Spring Boot!"
    }

    @GetMapping("/awake")
    awake(){
        "I'm awake"
    }

    @PostMapping("/create")
    create(){
    }

    @GetMapping("read")
    read(){
    }

}

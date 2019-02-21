package com.johander.groovyspring.controller

import com.johander.groovyspring.domain.Greeting
import com.johander.groovyspring.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class GreetingController {

    @Autowired
    GreetingService helloService

    @GetMapping("/")
    String hello(){
        "Hello from Spring Boot!"
    }

    @GetMapping("/awake")
    awake(){
        "I'm awake"
    }

    @PostMapping("/create")
    create(@RequestBody Greeting greeting){
        helloService.create(greeting)
    }

    @GetMapping("read")
    read(){
    }

}

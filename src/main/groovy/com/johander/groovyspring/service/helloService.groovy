package com.johander.groovyspring.service

import org.springframework.stereotype.Service

@Service
class helloService {

    static hello(){
        "Hello from Spring Boot!"
    }

    static create(greeting) {
        "I'll create this greeting: ${greeting}"
    }

    static read(id) {
        "Here's greeting ${id}: "
    }

    static update(id, newGreeting) {
        "I'll update this greeting ${id} with this change: ${newGreeting}"
    }

    static delete(id){
        "I'll delete greeting ${id}"
    }


}

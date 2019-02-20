package com.johander.groovyspring.service

import com.johander.groovyspring.domain.Greeting
import com.johander.groovyspring.repositories.GreetingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HelloService {

    @Autowired
    GreetingRepository greetingRepository

    static String hello(){
        "Hello from Spring Boot!"
    }

    String create(greeting) {
        "I'll create this greeting: ${greeting}"
        greetingRepository.save(greeting)
    }

    Greeting read(id) {
        "Here's greeting ${id}: "
        greetingRepository.findById(id)
    }

    List<Greeting> getByAuthor(String author) {
        greetingRepository.findbyAuthor(author)
    }

    static update(id, newGreeting) {
        "I'll update this greeting ${id} with this change: ${newGreeting}"
    }

    static delete(id){
        "I'll delete greeting ${id}"
    }

    ArrayList<Greeting> readAll(){
        greetingRepository.findAll()
    }


}

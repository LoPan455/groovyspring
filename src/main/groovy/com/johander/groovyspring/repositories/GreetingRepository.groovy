package com.johander.groovyspring.repositories

import com.johander.groovyspring.domain.Greeting
import org.springframework.data.domain.Page
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.data.repository.Repository

import java.awt.print.Pageable

@EnableMongoRepositories(basePackages = "org.tjohander.groovyspring.repository")
interface GreetingRepository extends MongoRepository<Greeting, Long> {

    Greeting findByAuthor(String author)

}

package com.johander.groovyspring.domain

import org.springframework.data.annotation.Id

class Greeting {

    @Id
    int id

    String greeting

    Date created

    Date modified

    String author

    Greeting(){}

    Greeting(greeting, author) {
        this.greeting = greeting
        this.created = new Date().format("yyyy-MM-dd'T'HH:mm:ss'Z'", TimeZone.getTimeZone("UTC"))
        this.modified = new Date().format("yyyy-MM-dd'T'HH:mm:ss'Z'", TimeZone.getTimeZone("UTC"))
        this.author = author
    }



    @Override
    String toString() {
        return "Greeting{" +
                "id=" + id +
                ", greeting='" + greeting + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", author='" + author + '\'' +
                '}'
    }
}

package com.johander.groovyspring.domain

import org.springframework.data.annotation.Id

class Greeting {

    @Id
    String _id

    String greeting

    Date created = new Date()

    Date modified = new Date()

    String author

    Greeting(){}

    Greeting(greeting, author) {
        this.greeting = greeting
        this.author = author
    }



    @Override
    String toString() {
        return "Greeting{" +
                "id=" + _id +
                ", greeting='" + greeting + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", author='" + author + '\'' +
                '}'
    }
}

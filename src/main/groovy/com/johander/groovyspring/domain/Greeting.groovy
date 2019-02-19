package com.johander.groovyspring.domain

class Greeting {

    int id

    String greeting

    Date created

    Date modified

    String author

    Greeting(greeting) {
        this.greeting = greeting
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

package com.johander.groovyspring.config

import com.mongodb.Mongo
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.MongoClientFactoryBean

@ConfigurationProperties
class AppConfig {

    @Bean
    MongoClientFactoryBean mongo() {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean()
        mongo.setHost()
        return mongo
    }
}

package com.johander.groovyspring.config

import com.mongodb.MongoClient
import com.mongodb.MongoClientURI
import com.mongodb.MongoCredential
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.config.AbstractMongoConfiguration
import org.springframework.data.mongodb.core.MongoClientFactoryBean
import org.springframework.data.mongodb.core.MongoTemplate

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@ConfigurationProperties("spring.data.mongodb")
class MongoConfig extends AbstractMongoConfiguration {

    @NotNull
    MongoClientURI uri

    @Override
    MongoClient mongoClient() {
        return new MongoClient(uri)
    }

    @Override
    protected String getDatabaseName() {
        return "greeting"
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.tjohander.groovyspring"
    }
}

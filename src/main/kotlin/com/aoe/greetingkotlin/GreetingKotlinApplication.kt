package com.aoe.greetingkotlin

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class GreetingKotlinApplication {

    @Bean
    fun sayHello(): (Person) -> String = {
        "Hello ${it.name}, how are you today ?"
    }

    @Bean
    fun mapper(): ObjectMapper = ObjectMapper().registerKotlinModule()


}

fun main(args: Array<String>) {
    runApplication<GreetingKotlinApplication>(*args)
}

data class Person(val name: String)
package com.example.demo

import com.example.demo.core.SimpleEntity
import com.example.demo.core.SimpleEntityRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
        .getBean(SimpleEntityRepository::class.java)
        .run {
            save(SimpleEntity("first", 2, false))
            findAll().forEach { print(it.first) }
        }
}

package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class DemoApplication

fun main() {
    runApplication<DemoApplication>()
}

@RestController
class PostController {
    var i = 0;

    @GetMapping("/")
    fun all(): String {
        i += 1
        return "Hello, world! $i"
    }
}

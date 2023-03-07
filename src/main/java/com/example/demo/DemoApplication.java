package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@RestController
class PostController {
    private int i = 0;

    @GetMapping("/")
    public String all() {
        i += 1;
        return String.format("Hello, world! (%d)", i);
    }
}

package com.example.testboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class TestBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestBootApplication.class, args);
    }

}

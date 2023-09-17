package com.lee.note.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.lee.note")
public class TestProviderServer {
    public static void main(String[] args) {
        SpringApplication.run(TestProviderServer.class, args);
    }
}

package com.lee.note.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.lee.note")
@ComponentScan(basePackages = "com.lee.note")
public class TestConsumerServer  
{
    public static void main(String[] args) {
        SpringApplication.run(TestConsumerServer.class, args);
    }
}

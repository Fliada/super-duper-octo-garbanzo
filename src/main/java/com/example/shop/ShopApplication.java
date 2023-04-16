package com.example.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ShopApplication.class, args);
        String port = context.getEnvironment().getProperty("server.port");
        System.out.println("http://localhost:" + port + "/");
    }

}

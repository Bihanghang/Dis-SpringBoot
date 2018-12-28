package com.bihang.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DisManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisManagerApplication.class, args);
    }

}


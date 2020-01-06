package com.designs.config;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//@SpringCloudApplication
@SpringBootApplication
@EnableConfigServer
public class DesignConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignConfigApplication.class, args);
    }

}

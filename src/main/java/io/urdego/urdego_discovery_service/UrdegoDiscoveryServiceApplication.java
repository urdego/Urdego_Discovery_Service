package io.urdego.urdego_discovery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UrdegoDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UrdegoDiscoveryServiceApplication.class, args);
    }
    
}

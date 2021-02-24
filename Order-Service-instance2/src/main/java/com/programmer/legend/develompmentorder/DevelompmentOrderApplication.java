package com.programmer.legend.develompmentorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DevelompmentOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevelompmentOrderApplication.class, args);
    }

}

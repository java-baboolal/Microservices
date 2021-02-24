package com.programmer.legend.develeopmentapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DeveleopmentApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeveleopmentApiGatewayApplication.class, args);
    }

}

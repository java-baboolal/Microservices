package com.programmer.legend.develompmentorder;

import com.programmer.legend.develompmentorder.rabbitmq.config.RabbitMQOrderChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableBinding(RabbitMQOrderChannel.class)
public class DevelompmentOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevelompmentOrderApplication.class, args);
    }

}

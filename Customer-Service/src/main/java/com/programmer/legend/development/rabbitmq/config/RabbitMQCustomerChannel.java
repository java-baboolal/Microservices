package com.programmer.legend.development.rabbitmq.config;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface RabbitMQCustomerChannel {
    String ORDER_PLACE_OUT = "place-order-out";

    @Output(RabbitMQCustomerChannel.ORDER_PLACE_OUT)
    MessageChannel outputChennel();
}

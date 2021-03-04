package com.programmer.legend.develompmentorder.rabbitmq.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface RabbitMQOrderChannel {

    String ORDER_PLACE_IN = "place-order-in";

    @Input(RabbitMQOrderChannel.ORDER_PLACE_IN)
    MessageChannel inputChennel();
}

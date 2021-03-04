package com.programmer.legend.paymentservice.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface RabbitMQPaymentChannel {

    String ORDER_PLACE_IN = "place-order-in";

    @Input(RabbitMQPaymentChannel.ORDER_PLACE_IN)
    MessageChannel inputChennel();
}

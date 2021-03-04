package com.programmer.legend.paymentservice.config;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RabbitMQListenerService {

    @StreamListener(RabbitMQPaymentChannel.ORDER_PLACE_IN)
    public void consumePlaceOrderEvent(Map<String,Object> orderDTO){
        System.out.println(orderDTO);

    }


}

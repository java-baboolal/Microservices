package com.programmer.legend.develompmentorder.rabbitmq.config;

import com.programmer.legend.develompmentorder.domain.CustomerOrder;
import com.programmer.legend.develompmentorder.domain.FoodMenuPrice;
import com.programmer.legend.develompmentorder.domain.Restaurant;
import com.programmer.legend.develompmentorder.dto.OrderDTO;
import com.programmer.legend.develompmentorder.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListenerService {



    @Autowired
    private OrderRepository orderRepository;

    @StreamListener(RabbitMQOrderChannel.ORDER_PLACE_IN)
    public void consumePlaceOrderEvent(OrderDTO orderDTO) {
        try{
            CustomerOrder order = new CustomerOrder();
            order.setCustomerId(orderDTO.getCustomerId());
            order.setFoodMenuPrice(new FoodMenuPrice(orderDTO.getMenuId()));
            order.setRestaurant(new Restaurant(orderDTO.getRestaurantId()));
            orderRepository.save(order);
        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }
}

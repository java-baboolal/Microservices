package com.programmer.legend.development.service;

import com.programmer.legend.development.dto.CustomerDTO;
import com.programmer.legend.development.dto.OrderDTO;
import com.programmer.legend.development.entity.Customer;
import com.programmer.legend.development.rabbitmq.config.RabbitMQCustomerChannel;
import com.programmer.legend.development.repository.CustomerRepository;
import com.sun.xml.internal.ws.server.sei.EndpointResponseMessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RabbitMQCustomerChannel channel;

    @Override
    @Transactional
    public ResponseEntity<String> createCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setFirstName(customerDTO.getFirstName());
        customer.setLastName(customerDTO.getLastName());
        //String dob [] = customerDTO.getDob().split("-");
        // customer.setDob(LocalDate.of(Integer.valueOf(dob[0]),Integer.valueOf(dob[1]),Integer.valueOf(dob[2])));
        customer.setDob(customerDTO.getDob());
        customer.setEmail(customerDTO.getEmail());
        customer.setPassword(customerDTO.getPassword());

        Customer savedCustomer = customerRepository.save(customer);
        String message = "";
        if (savedCustomer == null)
            message = "customer not saved in database.";
        else
            message = "customer is saved successfully in database.";
        if(customerDTO.getRestaurantId() != null && customerDTO.getMenuId() != null){
            String url = "http://localhost:9090/apigateway/service/order/placeOrder";

            OrderDTO order = new OrderDTO();
            order.setCustomerId(customer.getId().intValue());
            order.setMenuId(customerDTO.getMenuId());
            order.setRestaurantId(customerDTO.getRestaurantId());

           /* HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<OrderDTO> entity = new HttpEntity<>(order,headers);
            //Rest  call to order service.
            ResponseEntity<String> respone = restTemplate.exchange(url, HttpMethod.POST,entity,String.class);*/

           channel.outputChennel().send(MessageBuilder.withPayload(order).build());

        }
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @Override
    public CustomerDTO findCustomer(Long id) {
        Customer customer = customerRepository.findOne(id);
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setDob(customer.getDob());
        customerDTO.setFirstName(customer.getFirstName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setLastName(customer.getLastName());
        customerDTO.setPassword(customer.getPassword());
        return customerDTO;
    }
}

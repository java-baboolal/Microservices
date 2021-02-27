package com.programmer.legend.development.service;


import com.programmer.legend.development.dto.CustomerDTO;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
    ResponseEntity<String> createCustomer(CustomerDTO customerDTO);

    CustomerDTO findCustomer(Long id);
}

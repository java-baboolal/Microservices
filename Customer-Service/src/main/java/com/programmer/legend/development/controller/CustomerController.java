package com.programmer.legend.development.controller;

import com.programmer.legend.development.dto.CustomerDTO;
import com.programmer.legend.development.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/createCustomer")
    public ResponseEntity<String> createCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.createCustomer(customerDTO);
    }

    @GetMapping("/findCustomer/{id}")
    public CustomerDTO findCustomer(@PathVariable Long id) {
        return customerService.findCustomer(id);
    }
}

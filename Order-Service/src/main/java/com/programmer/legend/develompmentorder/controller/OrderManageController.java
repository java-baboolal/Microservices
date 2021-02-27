package com.programmer.legend.develompmentorder.controller;


import com.programmer.legend.develompmentorder.dto.OrderDTO;
import com.programmer.legend.develompmentorder.service.OrderManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderManageController {

    @Autowired
    OrderManageService orderManageService;

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody OrderDTO orderDTO){
        return orderManageService.placeOrder(orderDTO);
    }
}

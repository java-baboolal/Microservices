package com.programmer.legend.develompmentorder.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "food_menu_id_fk")
    private FoodMenuPrice foodMenuPrice;

    @ManyToOne
    @JoinColumn(name = "ord_rest_id_fk")
    private Restaurant restaurant;

    @Column(nullable = false)
    private Integer customerId;
}

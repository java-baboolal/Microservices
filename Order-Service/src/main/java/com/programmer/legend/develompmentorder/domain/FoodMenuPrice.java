package com.programmer.legend.develompmentorder.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class FoodMenuPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String menuName;
    private Double price;
    @ManyToOne
    @JoinColumn(name = "rest_id_fk")
    private Restaurant restaurant;

    public FoodMenuPrice(Integer menuId) {
        this.id = menuId;
    }
}

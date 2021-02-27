package com.programmer.legend.develompmentorder.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    @OneToMany(mappedBy = "restaurant")
    private List<FoodMenuPrice> foodMenuPrices;

    public Restaurant(Integer restaurantId) {
        this.id = restaurantId;
    }
}

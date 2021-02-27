package com.programmer.legend.develompmentorder.repository;

import com.programmer.legend.develompmentorder.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
}

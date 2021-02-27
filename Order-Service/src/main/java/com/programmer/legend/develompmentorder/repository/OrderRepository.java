package com.programmer.legend.develompmentorder.repository;

import com.programmer.legend.develompmentorder.domain.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomerOrder,Integer> {
}

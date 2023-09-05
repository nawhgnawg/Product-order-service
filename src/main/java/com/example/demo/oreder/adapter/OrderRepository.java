package com.example.demo.oreder.adapter;

import com.example.demo.oreder.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

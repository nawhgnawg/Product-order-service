package com.example.demo.oreder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

interface OrderRepository extends JpaRepository<Order, Long> {
}

package com.example.demo.payment.adapter;

import com.example.demo.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
interface PaymentRepository extends JpaRepository<Payment, Long> {
}

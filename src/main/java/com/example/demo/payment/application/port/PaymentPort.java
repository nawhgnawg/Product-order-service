package com.example.demo.payment.application.port;

import com.example.demo.oreder.domain.Order;
import com.example.demo.payment.domain.Payment;

public interface PaymentPort {
    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}

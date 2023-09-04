package com.example.demo.payment;

import com.example.demo.oreder.Order;

interface PaymentPort {
    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}

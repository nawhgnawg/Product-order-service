package com.example.demo.payment;

interface PaymentGateway {
    void excute(int totalPrice, String cardNumber);

}

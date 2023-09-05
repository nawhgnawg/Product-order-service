package com.example.demo.payment.adapter;

interface PaymentGateway {
    void excute(int totalPrice, String cardNumber);

}

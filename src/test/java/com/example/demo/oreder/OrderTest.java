package com.example.demo.oreder;

import com.example.demo.oreder.domain.Order;
import com.example.demo.product.domain.DiscountPolicy;
import com.example.demo.product.domain.Product;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OrderTest {

    @Test
    void getTotalPrice() {
        final Order order = new Order(new Product("상품명", 2000, DiscountPolicy.FIX_1000_AMOUNT), 2);

        final int totalPrice = order.getTotalPrice();

        assertThat(totalPrice).isEqualTo(2000);
    }
}
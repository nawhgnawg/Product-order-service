package com.example.demo.product;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DiscountPolicyTest {

    @Test
    void nonDiscountPolicy() {
        final int price = 1000;

        final int discountPrice = DiscountPolicy.NONE.applyDiscount(price);

        assertThat(discountPrice).isEqualTo(price);
    }

    @Test
    void fix_1000_discounted_price() {
        final int price = 2000;

        final int discountPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    void over_discounted_price() {
        final int price = 500;

        final int discountPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        assertThat(discountPrice).isEqualTo(0);
    }
}
package com.example.demo.oreder;

import com.example.demo.product.Product;
import org.springframework.stereotype.Component;

interface OrderPort {
    Product getProductById(final Long productId);

    void save(final Order order);
}

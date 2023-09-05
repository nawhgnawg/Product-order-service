package com.example.demo.oreder.application.port;

import com.example.demo.oreder.domain.Order;
import com.example.demo.product.domain.Product;

public interface OrderPort {
    Product getProductById(final Long productId);

    void save(final Order order);
}

package com.example.demo.product.application.port;

import com.example.demo.product.domain.Product;

public interface ProductPort {
    void save(final Product product);

    Product getProduct(Long productId);

}

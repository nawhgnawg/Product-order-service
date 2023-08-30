package com.example.demo.product;

interface ProductPort {
    void save(final Product product);

    Product getProduct(Long productId);

}

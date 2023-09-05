package com.example.demo.oreder.adapter;

import com.example.demo.oreder.domain.Order;
import com.example.demo.oreder.application.port.OrderPort;
import com.example.demo.product.domain.Product;
import com.example.demo.product.adapter.ProductRepository;
import org.springframework.stereotype.Component;

@Component
class OrderAdapter implements OrderPort {
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    private OrderAdapter(final ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("상품이 존재하지 않습니다."));
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }
}

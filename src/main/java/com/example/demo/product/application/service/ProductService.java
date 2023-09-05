package com.example.demo.product.application.service;

import com.example.demo.product.application.port.ProductPort;
import com.example.demo.product.domain.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/products")
public
class ProductService {
    final private ProductPort productPort;

    ProductService(ProductPort productProt) {
        this.productPort = productProt;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Void> addProduct(@RequestBody final AddProductRequest request) {
        final Product product = new Product(request.name(), request.price(), request.discountPolicy());

        productPort.save(product);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @GetMapping("/{productId}")
    public ResponseEntity<GetProductResponse> getProduct(@PathVariable final Long productId) {
        final Product product = productPort.getProduct(productId);

        final GetProductResponse response = new GetProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDiscountPolicy());
        return ResponseEntity.ok(response);

    }

    @PatchMapping("/{productId}")
    @Transactional
    public void updateProduct(
            @PathVariable Long productId,
            @RequestBody UpdateProductRequest request) {
        final Product product = productPort.getProduct(productId);

        product.update(request.name(), request.price(), request.discountPolicy());

        productPort.save(product);
    }
}

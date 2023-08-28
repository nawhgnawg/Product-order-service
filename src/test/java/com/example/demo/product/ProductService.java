package com.example.demo.product;

class ProductService {
    final private ProductPort productPort;

    ProductService(ProductPort productProt) {
        this.productPort = productProt;
    }

    public void addProduct(final AddProductRequest request) {
        final Product product = new Product(request.name(), request.price(), request.discountPolicy());

        productPort.save(product);
    }

}

package com.example.demo.product;

import com.example.demo.product.application.service.GetProductResponse;
import com.example.demo.product.application.service.ProductService;
import com.example.demo.product.application.service.UpdateProductRequest;
import com.example.demo.product.application.port.ProductPort;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static com.example.demo.product.ProductSteps.상품수정요청_생성;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductPort productPort;

    @Test
    void 상품수정() {
        productService.addProduct(ProductSteps.상품등록요청_생성());

        final Long productId = 1L;
        final UpdateProductRequest request = 상품수정요청_생성();

        productService.updateProduct(productId, request);

        final ResponseEntity<GetProductResponse> response = productService.getProduct(productId);
        final GetProductResponse productResponse = response.getBody();
        assertThat(productResponse.name()).isEqualTo("상품 수정");
        assertThat(productResponse.price()).isEqualTo(2000);

    }

}

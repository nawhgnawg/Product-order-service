package com.example.demo.oreder;

import com.example.demo.ApiTest;
import com.example.demo.product.*;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;


class OrderApiTest extends ApiTest {

    @Test
    void 상품주문() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        final CreateOrderRequest request = OrderSteps.상품주문요청_생성();

        final var response = OrderSteps.상품주문요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

}

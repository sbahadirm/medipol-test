package com.bahadirmemis.medipoltest.order;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrdOrderService ordOrderService;

    @PostMapping
    @Operation(tags = "Order Controller")
    public ResponseEntity create(@Valid @RequestBody CreateOrderRequestDto createOrderRequestDto){

        Order order = ordOrderService.createOrder(createOrderRequestDto);

        return ResponseEntity.ok(order);
    }
}

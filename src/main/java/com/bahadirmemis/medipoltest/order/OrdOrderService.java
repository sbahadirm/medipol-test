package com.bahadirmemis.medipoltest.order;

import com.bahadirmemis.medipoltest.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class OrdOrderService {

    private final ProductService productService;
    private final OrderEntityService orderEntityService;

    public Order createOrder(CreateOrderRequestDto createOrderRequestDto) {

        Long customerId = createOrderRequestDto.getCustomerId();
        Long productId = createOrderRequestDto.getProductId();
        Long amount = createOrderRequestDto.getAmount();

        productService.removeStock(productId, amount);

        Order order = new Order();
        order.setCustomerId(customerId);
        order.setOrderDate(new Date());
        order.setAmount(amount);
        order.setProductId(productId);
        order = orderEntityService.save(order);

        return order;
    }
}

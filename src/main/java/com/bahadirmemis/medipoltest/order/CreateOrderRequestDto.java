package com.bahadirmemis.medipoltest.order;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Data
public class CreateOrderRequestDto {

    @NotNull
    @Positive
    private Long customerId;

    @NotNull
    @Positive
    private Long productId;

    @NotNull
    @Positive
    private Long amount;
}

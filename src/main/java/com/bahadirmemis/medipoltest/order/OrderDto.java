package com.bahadirmemis.medipoltest.order;

import lombok.Data;

import java.util.Date;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Data
public class OrderDto {

    private Long id;
    private Long customerId;
    private Long productId;
    private Date orderDate;
    private Long amount;
}

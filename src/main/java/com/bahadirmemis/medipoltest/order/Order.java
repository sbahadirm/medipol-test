package com.bahadirmemis.medipoltest.order;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "PRODUCT_ORDER")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "ID_CUSTOMER")
    private Long customerId;

    @Column(name = "ID_PRODUCT")
    private Long productId;

    @Column(name = "AMOUNT")
    private Long amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
}

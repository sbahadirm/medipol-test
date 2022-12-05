package com.bahadirmemis.medipoltest.product;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Entity
@Getter
@Setter
public class Product {

    @GeneratedValue
    @Id
    private Long id;

    @Column(name = "NAME", length = 100)
    private String name;

    @Column(name = "CURRENT_STOCK")
    private Long currentStock;
}

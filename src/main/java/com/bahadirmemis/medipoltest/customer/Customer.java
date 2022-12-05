package com.bahadirmemis.medipoltest.customer;

import lombok.Getter;
import lombok.Setter;

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
public class Customer {

    @GeneratedValue
    @Id
    private Long id;

    private String name;
}

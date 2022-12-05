package com.bahadirmemis.medipoltest.product;

import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
public class ProductValidator {

    public void validateAmount(Long amount) {
        if (amount.compareTo(0L) <= 0){
            throw new RuntimeException("Amount can not be zero or negative!");
        }
    }

    public void validateNewStock(Long newStock) {

        if (newStock.compareTo(0L) < 0){
            throw new RuntimeException("Stock can not be negative!");
        }
    }
}

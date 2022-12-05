package com.bahadirmemis.medipoltest.product;

import org.springframework.stereotype.Service;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
public class ProductCalculatorService {

    public Long calculateStock(Product product, Long amount, EnumStockMovementType stockMovementType) {

        Long currentStock = product.getCurrentStock();

        Long newStock;
        if (EnumStockMovementType.REMOVE.equals(stockMovementType)){
            newStock = currentStock - amount;
        } else if (EnumStockMovementType.ADD.equals(stockMovementType)){
            newStock = currentStock + amount;
        } else {
            throw new RuntimeException("Stock movement type cannot be null!");
        }

        return newStock;
    }
}

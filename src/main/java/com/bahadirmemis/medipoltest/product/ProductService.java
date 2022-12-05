package com.bahadirmemis.medipoltest.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductValidator productValidator;
    private final ProductEntityService productEntityService;
    private final ProductCalculatorService productCalculatorService;

    public Product saveProduct(Product product) {

        return productEntityService.save(product);
    }

    public Long addStock(Long productId, Long amount) {
        return updateAndGetNewStock(productId, amount, EnumStockMovementType.ADD);
    }

    public Long removeStock(Long prdBookId, Long amount) {
        return updateAndGetNewStock(prdBookId, amount, EnumStockMovementType.REMOVE);
    }

    public Long updateAndGetNewStock(Long productId, Long amount, EnumStockMovementType stockMovementType) {
        productValidator.validateAmount(amount);

        Product product = productEntityService.findById(productId).orElseThrow();

        Long newStock = productCalculatorService.calculateStock(product, amount, stockMovementType);

        productValidator.validateNewStock(newStock);

        product.setCurrentStock(newStock);
        product = productEntityService.save(product);

        return newStock;
    }

    public Product findById(Long id) {
        return productEntityService.findById(id).orElseThrow();
    }

    public List<Product> findAll() {
        return productEntityService.findAll();
    }
}

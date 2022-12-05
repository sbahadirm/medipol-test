package com.bahadirmemis.medipoltest.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductEntityService productEntityService;

    @Mock
    private ProductValidator productValidator;

    @Mock
    private ProductCalculatorService productCalculatorService;

    @Test
    void shouldSaveProduct() {

        Product product = Mockito.mock(Product.class);
        Mockito.when(product.getId()).thenReturn(18L);

        Mockito.when(productEntityService.save(Mockito.any())).thenReturn(product);

        Product result = productService.saveProduct(product);

        Assertions.assertEquals(18L, result.getId());
    }

    @Test
    void shouldUpdateAndGetNewStock() {

        //given
        Product product = Mockito.mock(Product.class);
        Long productId = 6L;
        Long amount = 10L;
        EnumStockMovementType stockMovementType = EnumStockMovementType.ADD;
        Long expectedStock = 18L;

        //when
        Mockito.doNothing().when(productValidator).validateAmount(amount);
        Mockito.when(productEntityService.findById(productId)).thenReturn(Optional.of(product));
        Mockito.when(productCalculatorService.calculateStock(product, amount, stockMovementType))
                .thenReturn(expectedStock);
        Mockito.doNothing().when(productValidator).validateNewStock(Mockito.anyLong());
        Mockito.when(productEntityService.save(Mockito.any(Product.class))).thenReturn(product);

        // then
        Long result = productService.updateAndGetNewStock(productId, amount, stockMovementType);

        Assertions.assertEquals(18L, result);

    }
}
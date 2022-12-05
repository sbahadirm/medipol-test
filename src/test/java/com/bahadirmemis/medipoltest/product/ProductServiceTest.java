package com.bahadirmemis.medipoltest.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

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
    private ProductValidator productValidator;

    @Mock
    private ProductEntityService productEntityService;

    @Mock
    private ProductCalculatorService productCalculatorService;

    @Test
    void shouldSaveProduct(){

        Product product = Mockito.mock(Product.class);
        Mockito.when(product.getId()).thenReturn(18L);

        Mockito.when(productEntityService.save(Mockito.any())).thenReturn(product);

        Product result = productService.saveProduct(product);

        Assertions.assertEquals(18L, result.getId());
    }

    @Test
    void shouldUpdateAndGetNewStock() {

        Product product = Mockito.mock(Product.class);

        Mockito.doNothing().when(productValidator).validateAmount(Mockito.anyLong());
        Mockito.when(productEntityService.findById(Mockito.anyLong())).thenReturn(Optional.of(product));
        Mockito.when(productCalculatorService.calculateStock(product, 5L, EnumStockMovementType.ADD))
                .thenReturn(105L);
        Mockito.doNothing().when(productValidator).validateNewStock(Mockito.anyLong());
        Mockito.when(productEntityService.save(Mockito.any())).thenReturn(product);

        Long result = productService.updateAndGetNewStock(1L, 5L, EnumStockMovementType.ADD);

        Assertions.assertEquals(105L, result);
    }
}
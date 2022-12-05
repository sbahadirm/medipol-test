package com.bahadirmemis.medipoltest.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
class CalculatorServiceTest {

    @Test
    void shouldAdd() {

        BigDecimal three = new BigDecimal(3);
        BigDecimal five = new BigDecimal(5);
        BigDecimal expected = new BigDecimal(8);

        BigDecimal result = CalculatorService.add(three, five);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldAddWhenParametersAreNull() {

        BigDecimal result = CalculatorService.add(null, null);

        Assertions.assertEquals(BigDecimal.ZERO, result);
    }

    @Test
    void shouldAddWhenParameter1IsNegative(){

        BigDecimal param1 = new BigDecimal(-10);
        BigDecimal param2 = new BigDecimal(8);
        BigDecimal expected = new BigDecimal(-2);

        BigDecimal result = CalculatorService.add(param1, param2);

        Assertions.assertEquals(expected, result);

    }

    @Test
    void shouldCompare() {

        BigDecimal param1 = BigDecimal.ONE;
        BigDecimal param2 = BigDecimal.ONE;

        boolean result = CalculatorService.compare(param1, param2);

        Assertions.assertTrue(result); // Assertions.assertEquals(Boolean.TRUE, result);
    }

    @Test
    void shouldNotCompareWhenParametersAreDifferent() {

        BigDecimal param1 = BigDecimal.ZERO;
        BigDecimal param2 = BigDecimal.ONE;

        boolean result = CalculatorService.compare(param1, param2);

        Assertions.assertFalse(result); // //Assertions.assertEquals(Boolean.FALSE, result);
    }

    @Test
    void shouldNotCompareJavaExceptionExample() {

        System.out.println("test başladı");

        BigDecimal param1 = null;
        BigDecimal param2 = BigDecimal.ONE;

        try {
            CalculatorService.compare(param1, param2);
        } catch (Exception e){
            System.out.println("hatayı yakaladım ama önemsemiyorum. ");
        }

        System.out.println("Test bitti");
    }

    @Test
    void shouldNotCompareWhenCompareThrowsRuntimeException() {

        BigDecimal param1 = null;
        BigDecimal param2 = BigDecimal.ONE;

        RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class, () -> CalculatorService.compare(param1, param2));

        Assertions.assertEquals("Number 1 cannot be null", runtimeException.getMessage());
    }
}
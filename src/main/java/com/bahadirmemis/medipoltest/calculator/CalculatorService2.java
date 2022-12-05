package com.bahadirmemis.medipoltest.calculator;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
public class CalculatorService2 {

    public static BigDecimal add(BigDecimal number1, BigDecimal number2){

        if (number1 == null ){
            number1 = BigDecimal.ZERO;
        }

        if (number2 == null ){
            number2 = BigDecimal.ZERO;
        }

        return number1.add(number2);
    }
}

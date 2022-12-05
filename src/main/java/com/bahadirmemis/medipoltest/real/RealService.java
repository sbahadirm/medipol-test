package com.bahadirmemis.medipoltest.real;

import com.bahadirmemis.medipoltest.calculator.CalculatorService;
import com.bahadirmemis.medipoltest.calculator.CalculatorService2;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class RealService {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1(){

        BigDecimal number1 = BigDecimal.ONE;
        BigDecimal number2 = BigDecimal.valueOf(100);

        BigDecimal result = CalculatorService2.add(number1, number2);

        System.out.println(result);
    }

    public static void test2(){

        BigDecimal number1 = null;
        BigDecimal number2 = BigDecimal.valueOf(100);

        BigDecimal result = CalculatorService2.add(number1, number2);

        System.out.println(result);
    }
}

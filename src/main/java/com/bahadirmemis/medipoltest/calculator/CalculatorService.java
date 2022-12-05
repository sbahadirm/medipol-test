package com.bahadirmemis.medipoltest.calculator;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
public class CalculatorService {

    public static boolean compare(BigDecimal number1, BigDecimal number2){

        System.out.println("compare metoduna geldim");

        if (number1 == null){
            System.out.println("exception fırlatacağım");
            throw new RuntimeException("Number 1 cannot be null");
        }

        System.out.println("birazdan sonucu hesaplayacağım.");

        return number1.equals(number2);
    }

    public static BigDecimal add(BigDecimal number1, BigDecimal number2){

        if (number1 == null ){
            number1 = BigDecimal.ZERO;
        }

        if (number2 == null ){
            number2 = BigDecimal.ZERO;
        }

        return number1.add(number2);
    }

//    public static BigDecimal add(BigDecimal number1, BigDecimal number2){
//
//        if (number1 == null || number2 == null){
//            throw new RuntimeException("Values cannot be null!");
//        }
//
//        return number1.add(number2);
//    }
}

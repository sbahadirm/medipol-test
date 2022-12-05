package com.bahadirmemis.medipoltest.calculator;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
class CalculatorServiceTest {

    @BeforeAll
    static void setUp(){
//        System.out.println("BeforeAll");
    }

    @BeforeEach
    void beforeEach(){
//        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEach(){
//        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll(){
//        System.out.println("AfterAll");
    }

    @Test
    void shouldAdd() {

        BigDecimal number1 = BigDecimal.ONE;
        BigDecimal number2 = BigDecimal.TEN;

        BigDecimal result = CalculatorService.add(number1, number2);

        Assertions.assertEquals(BigDecimal.valueOf(11), result);
    }

    @Test
    void shouldNotAddWhenFirstNumberIsNull() {

        BigDecimal number1 = BigDecimal.ONE;

        Assertions.assertThrows(RuntimeException.class, () -> CalculatorService.add(number1, null));

    }

    @Test
    void shouldNotAddWhenSecondNumberIsNull() {

        BigDecimal number2 = BigDecimal.ONE;

        Assertions.assertThrows(RuntimeException.class, () -> CalculatorService.add(null, number2));

    }

//    @Test
//    void add1() {
//        System.out.println("add1");
//    }
//
//    @Test
//    void add2() {
//        System.out.println("add2");
//    }
//
//    @Test
//    void add3() {
//        System.out.println("add3");
//    }
}
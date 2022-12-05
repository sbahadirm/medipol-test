package com.bahadirmemis.medipoltest.calculator;

import org.junit.jupiter.api.*;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
class JunitAnotationTest {

    @BeforeAll // BeforeClass
    static void beforeAll(){
        System.out.println("beforeAll çalıştı");
    }

    @AfterAll // AfterClass
    static void afterAll(){
        System.out.println("afterAll çalıştı");
    }

    @BeforeEach //Before
    void beforeEach(){
        System.out.println("beforeEach çalıştı");
    }

    @AfterEach // After
    void afterEach(){
        System.out.println("afterEach çalıştı");
    }

    @Test
    void test1(){
        System.out.println("test1 metodu çalıştı");
    }

    @Test
    void test2(){
        System.out.println("test2 metodu çalıştı");
    }
}
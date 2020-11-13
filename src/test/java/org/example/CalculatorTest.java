package org.example;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.*;

/**

 @Test på alla
 @DisplayName på alla
 @RepeateTest på MultiTest
 @Disabled på DelTest

 assertEquals addTest
 assertTrue versialer
 assertNotEquals vendTest
 assertNotNull gemener
 assertFalse vend



 * @Test // test
 @DisplayName("ADD +") // namn på testet

 @RepeatedTest //upprepa testet
 @Disabled // kör inte detta test


 // före , efter en eller alla tester
 @BeforeEach
 @AfterEach
 @BeforeAll
 @AfterAll


 // är de lika eller inte
 assertEquals
 assertNotEquals

 //Sant eller inte
 assertTrue
 assertFalse

//
 assertNull
 assertNotNull
 */
public class CalculatorTest
{
    @BeforeEach
    void init() {
        System.out.println("Before each test");
    }

    @DisplayName("ADD +") // namn på testet

    @Test

    public void AddTest()
    {
        Calculator app = new Calculator();
        assertEquals(4, Calculator.add(1,3));


    }

    @Disabled
    @DisplayName("Del -")
    @Test
    public void DelTest(){
        Calculator app = new Calculator();
        assertEquals(4, Calculator.del(6,2));



    }


    @RepeatedTest (5)
    @DisplayName("multi *")

    public void multiTest(){
        Calculator app = new Calculator();
        assertEquals(12, Calculator.multi(6,2));
        assertTrue(12==Calculator.multi(6,2));



    }

    @DisplayName("Div /")
    @Test
    public void DivTest(){
        Calculator app = new Calculator();
        assertNotEquals(3, Calculator.div(6,3));



    }


}

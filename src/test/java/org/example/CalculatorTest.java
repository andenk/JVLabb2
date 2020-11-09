package org.example;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{


    @DisplayName("ADD +")
    @Test

    public void AddTest()
    {
        Calculator app = new Calculator();
        assertEquals(4, Calculator.add(1,3));


    }


    @DisplayName("Del -")
    @Test
    public void DelTest(){
        Calculator app = new Calculator();
        assertEquals(4, Calculator.del(6,2));



    }
    @DisplayName("multi *")
    @Test
    public void multiTest(){
        Calculator app = new Calculator();
        assertEquals(12, Calculator.multi(6,2));



    }

    @DisplayName("Div /")
    @Test
    public void DivTest(){
        Calculator app = new Calculator();
        assertEquals(3, Calculator.div(6,2));



    }


}

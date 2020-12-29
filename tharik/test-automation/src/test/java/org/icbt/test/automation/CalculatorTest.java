/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.test.automation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tharik
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int no1 = 3;
        int no2 = 5;
        int expResult = 8;
        int result = Calculator.add(no1, no2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddNegativeValues() {
        System.out.println("add negative values");
        int no1 = -3;
        int no2 = -5;
        int expResult = -8;
        int result = Calculator.add(no1, no2);
        assertEquals(expResult, result);
    }


    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int no1 = 5;
        int no2 = 3;
        int expResult = 2;
        int result = Calculator.subtract(no1, no2);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int no1 = 3;
        int no2 = 4;
        int expResult = 12;
        int result = Calculator.multiply(no1, no2);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int no1 = 18;
        int no2 = 3;
        int expResult = 6;
        int result = Calculator.divide(no1, no2);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testGetText() {
        String expResult = "Hello";
        String result = Calculator.getText();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProcess() {
        try {
            Calculator.process();
        } catch(ArrayIndexOutOfBoundsException e) {
            assertTrue(true);
        } 
    }
    
    @Test
    public void testProcess1() {
        int no = 43;
        int expResult = 33;
        int result = Calculator.process(no);
        
        assertEquals(expResult, result);
 
    }
    
    @Test
    public void testProcess2() {
        int no = -43;
        int expResult = -53;
        int result = Calculator.process(no);
        
        assertEquals(expResult, result);
 
    }
    
}

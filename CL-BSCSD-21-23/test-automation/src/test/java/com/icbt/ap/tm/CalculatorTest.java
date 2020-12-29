package com.icbt.ap.tm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tharindu Eranga
 * @date Tue 29 Dec 2020
 */
class CalculatorTest {

    @Test
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    void substract() {
        assertEquals(3, Calculator.substract(5, 2));
    }

    @Test
    void multiply() {
        assertEquals(8, Calculator.multiply(4, 2));
    }

    @Test
    void divide() {
        assertEquals(3, Calculator.divide(6, 2));
    }

    @Test
    void remainder() {
        assertEquals(1, Calculator.remainder(7, 2));
    }
}
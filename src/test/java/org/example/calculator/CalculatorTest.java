package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 10);
        assertEquals(50, result);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 5);
        assertEquals(2.0, result);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    void addition() {
        Calculator calculator = new Calculator();
        int result = calculator.addition(10, 5);
        assertEquals(15, result);
    }

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.addition(10, 5 , 8 ,12);
        assertEquals(35, result);
    }

    @Test
    void testAddition1() {
        Calculator calculator = new Calculator();
        int[] array = {5, 18, 22, 89, 97};
        int result = calculator.addition(array);
        assertEquals(231, result);
    }
}
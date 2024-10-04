package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        // int result = calculator.add(2, 3);
        // assertEquals(5, result, "2 + 3 should equal 5");
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        // int result = calculator.subtract(3, 2);
        // assertEquals(1, result, "3 - 2 should equal 1");
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        // int result = calculator.multiply(3, 2);
        // assertEquals(6, result, "3 * 2 should equal 6");
        assertEquals(6, calculator.multiply(3, 2), "3 * 2 should equal 6");
        // assertTrue(6, result), "3 * 2 should equal 6");
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        }, "Division by zero should throw ArithmeticException");
    }
}

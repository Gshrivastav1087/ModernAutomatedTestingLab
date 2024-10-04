package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b; // Perform addition
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        // return a / b;
        throw new ArithmeticException("Unimplemented method 'divide'");
    }
}

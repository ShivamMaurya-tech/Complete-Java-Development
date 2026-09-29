package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addShouldReturnSum() {
        assertEquals(10, calculator.add(4, 6));
    }

    @Test
    void multiplyShouldReturnProduct() {
        assertEquals(12, calculator.multiply(3, 4));
    }
}

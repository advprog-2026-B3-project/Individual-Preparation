package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ArithmeticUtilityTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void add_returnsCorrectResult() {
        assertEquals(5.0, arithmeticUtility.add(2.0, 3.0), 1e-9);
        assertEquals(-1.0, arithmeticUtility.add(2.0, -3.0), 1e-9);
        assertEquals(0.0, arithmeticUtility.add(0.0, 0.0), 1e-9);
    }

    @Test
    void testDivideNormal() {
        double result = arithmeticUtility.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            arithmeticUtility.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    public void testExponentZero() {
        assertEquals(1.0, arithmeticUtility.exponent(5.0, 0), 0.0001);
    }

    @Test
    public void testExponentNegative() {
        assertEquals(0.25, arithmeticUtility.exponent(2.0, -2), 0.0001);
    }

    @Test
    public void testExponentBaseZero() {
        assertEquals(0.0, arithmeticUtility.exponent(0.0, 3), 0.0001);
    }

    @Test
    public void testExponentBaseOne() {
        assertEquals(1.0, arithmeticUtility.exponent(1.0, 10), 0.0001);
    }

    @Test
    void subtract_returnsCorrectResult() {
        assertEquals(2.0, arithmeticUtility.subtract(5.0, 3.0), 1e-9);
        assertEquals(-8.0, arithmeticUtility.subtract(-5.0, 3.0), 1e-9);
        assertEquals(0.0, arithmeticUtility.subtract(3.0, 3.0), 1e-9);
    }

    @Test
    void testMultiply_correctResult() {
        assertEquals(42.0, arithmeticUtility.multiply(6.0, 7.0), 1e-9);
        assertEquals(42.0, arithmeticUtility.multiply(-6.0, -7.0), 1e-9);
        assertEquals(-8.0, arithmeticUtility.multiply(2.0, -4.0), 1e-9);
        assertEquals(0.0, arithmeticUtility.multiply(0.0, 0.0), 1e-9);
    }
}

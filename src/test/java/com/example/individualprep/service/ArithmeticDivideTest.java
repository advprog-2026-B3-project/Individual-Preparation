package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticDivideTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();


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
}

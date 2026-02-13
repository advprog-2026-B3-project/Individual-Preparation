package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArithmeticSubtractTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void subtract_returnsCorrectResult() {
        assertEquals(2.0, arithmeticUtility.subtract(5.0, 3.0), 1e-9);
        assertEquals(-8.0, arithmeticUtility.subtract(-5.0, 3.0), 1e-9);
        assertEquals(0.0, arithmeticUtility.subtract(3.0, 3.0), 1e-9);
    }
}

package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ArithmeticUtilityTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void add_returnsCorrectResult() {
        assertEquals(5.0, arithmeticUtility.add(2.0, 3.0), 1e-9);
        assertEquals(-1.0, arithmeticUtility.add(2.0, -3.0), 1e-9);
        assertEquals(0.0, arithmeticUtility.add(0.0, 0.0), 1e-9);
    }
}

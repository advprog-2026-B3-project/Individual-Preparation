package com.service;

import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticExponentTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    public void testExponentPositive() {
        assertEquals(8.0, arithmeticUtility.exponent(2.0, 3), 0.0001);
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
}
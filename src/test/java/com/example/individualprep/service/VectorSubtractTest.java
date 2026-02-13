package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VectorSubtractTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testSubtract_NormalCase() {
        double[] v1 = {5.0, 7.0, 9.0};
        double[] v2 = {1.0, 2.0, 3.0};

        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(new double[]{4.0, 5.0, 6.0}, result);
    }

    @Test
    void testSubtract_WithNegativeNumbers() {
        double[] v1 = {3.0, -2.0, 5.0};
        double[] v2 = {1.0, 4.0, -1.0};

        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(new double[]{2.0, -6.0, 6.0}, result);
    }

    @Test
    void testSubtract_DifferentLength_ShouldThrowException() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};

        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.subtract(v1, v2);
        });
    }
}

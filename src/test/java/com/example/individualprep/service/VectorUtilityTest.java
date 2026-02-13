package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VectorUtilityTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void add_sameDimension_returnsCorrect() {
        double[] v1 = {1, 2, 3};
        double[] v2 = {4, 5, 6};
        double[] expected = {5, 7, 9};
        assertArrayEquals(expected, vectorUtility.add(v1, v2), 1e-9);
    }

    @Test
    void add_dimensionMismatch_throws() {
        double[] v1 = {1, 2};
        double[] v2 = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.add(v1, v2));
    }

    @Test
    void norm_returnsCorrect() {
        double[] v1 = {3, 4};
        assertEquals(5.0, vectorUtility.norm(v1), 1e-9);
        
        double[] v2 = {1, 0, 0};
        assertEquals(1.0, vectorUtility.norm(v2), 1e-9);

        double[] v3 = {0, 0};
        assertEquals(0.0, vectorUtility.norm(v3), 1e-9);
    }

    @Test
    void norm_null_throws() {
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.norm(null));
    }
}

package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorDotProductTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void dotProduct_sameDimension_returnsCorrect() {
        double[] v1 = {1, 2, 3};
        double[] v2 = {4, 5, 6};
        assertEquals(32.0, vectorUtility.dotProduct(v1, v2), 1e-9);
    }

    @Test
    void dotProduct_dimensionMismatch_throws() {
        double[] v1 = {1, 2};
        double[] v2 = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.dotProduct(v1, v2));
    }

    @Test
    void dotProduct_null_throws() {
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.dotProduct(null, new double[]{1}));
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.dotProduct(new double[]{1}, null));
    }
}

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

    @Test
    public void testAddNormalVectors() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double[] expected = {5.0, 7.0, 9.0};
        assertArrayEquals(expected, vectorUtility.add(v1, v2), 0.0001);
    }

    @Test
    public void testAddVectorsWithNegativeValues() {
        double[] v1 = {-1.0, 2.0, -3.0};
        double[] v2 = {4.0, -5.0, 6.0};
        double[] expected = {3.0, -3.0, 3.0};
        assertArrayEquals(expected, vectorUtility.add(v1, v2), 0.0001);
    }

    @Test
    public void testAddEmptyVectors() {
        double[] v1 = {};
        double[] v2 = {};
        double[] expected = {};
        assertArrayEquals(expected, vectorUtility.add(v1, v2));
    }

    @Test
    public void testAddVectorsDifferentLengths() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.add(v1, v2));
    }

    @Test
    void testMultiply_normalCase_returnsCorrect() {
        double[] v1 = {1, 2, 3};
        int scalar = 2;
        double[] expected = {2, 4, 6};
        assertArrayEquals(expected, vectorUtility.multiply(v1, scalar), 1e-9);
    }

    @Test
    void testMultiply_withZero_returnsZeroVector() {
        double[] v1 = {1, 2, 3};
        int scalar = 0;
        double[] expected = {0, 0, 0};
        assertArrayEquals(expected, vectorUtility.multiply(v1, scalar), 1e-9);
    }

    @Test
    void TestMultiply_withNegativeScalar_returnsCorrect() {
        double[] v1 = {1, 2, 3};
        int scalar = -2;
        double[] expected = {-2, -4, -6};
        assertArrayEquals(expected, vectorUtility.multiply(v1, scalar), 1e-9);
    }

    @Test
    void testMultiply_withNegativeValues_returnsCorrect() {
        double[] v1 = {-1, 2, -3};
        int scalar = 3;
        double[] expected = {-3, 6, -9};
        assertArrayEquals(expected, vectorUtility.multiply(v1, scalar), 1e-9);
    }

    @Test
    void TestMultiply_emptyVector_returnsEmpty() {
        double[] v1 = {};
        int scalar = 5;
        double[] expected = {};
        assertArrayEquals(expected, vectorUtility.multiply(v1, scalar), 1e-9);
    }

    @Test
    void testMultiply_withOne_returnsSameVector() {
        double[] v1 = {1, 2, 3};
        int scalar = 1;
        double[] expected = {1, 2, 3};
        assertArrayEquals(expected, vectorUtility.multiply(v1, scalar), 1e-9);
    }
}

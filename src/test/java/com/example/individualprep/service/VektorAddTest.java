package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VektorAddTest {

    private final VectorUtility vectorUtility = new VectorUtility();

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
}

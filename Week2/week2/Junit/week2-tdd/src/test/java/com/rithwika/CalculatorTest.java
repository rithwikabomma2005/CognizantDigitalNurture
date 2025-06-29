package com.rithwika;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(9, Calculator.add(4, 5)); // 4 + 5 = 9
    }

    @Test
    void testMultiply() {
        assertEquals(20, Calculator.multiply(4, 5)); // 4 × 5 = 20
    }

    @Test
    void testGreaterThan() {
        assertTrue(Calculator.add(3, 2) > 4); // 5 > 4
    }

    @Test
    void testNotEqual() {
        assertNotEquals(10, Calculator.multiply(2, 3)); // 2 × 3 ≠ 10
    }
}

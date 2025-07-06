package com.rithwika;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest1 {

    Calculator1 calc;

    @BeforeEach
    void setup() {
        calc = new Calculator1();
    }

    @Test
    void testAddition_AAA() {
        int result = calc.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    void testSubtraction_AAA() {
        int result = calc.subtract(10, 3);
        assertEquals(7, result);
    }

    @AfterEach
    void teardown() {
        System.out.println("Test finished");
    }
}

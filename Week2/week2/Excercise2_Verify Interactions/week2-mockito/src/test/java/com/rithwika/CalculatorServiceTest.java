package com.rithwika;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @Test
    public void testAdd() {
        CalculatorService calc = new CalculatorService();
        assertEquals(5, calc.add(2, 3));
    }
}
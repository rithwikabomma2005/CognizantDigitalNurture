package com.rithwika;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest2 {

    Calculator2 calc;

    // 🧩 Arrange: Setup before each test
    @BeforeEach
    void setup() {
        calc = new Calculator2();
        System.out.println("🔧 Setup complete");
    }

    // ✅ Act + Assert
    @Test
    void testAddition_AAA() {
        int result = calc.add(10, 5);     // Act
        assertEquals(15, result);         // Assert
    }

    @Test
    void testSubtraction_AAA() {
        int result = calc.subtract(10, 4); // Act
        assertEquals(6, result);           // Assert
    }

    // 🧹 Teardown after each test
    @AfterEach
    void teardown() {
        System.out.println("🧹 Teardown complete\n");
    }
}

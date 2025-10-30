package com.project.testautomation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSub() {
        assertEquals(1, calculator.sub(3, 2));
    }

    @Test
    public void testMul() {
        assertEquals(6, calculator.mul(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(2, calculator.div(6, 3));
    }
}

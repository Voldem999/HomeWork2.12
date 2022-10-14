package com.calculator.calculator;

import org.junit.jupiter.api.Test;

import static com.calculator.calculator.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void plusTest1() {
        int result = calculatorService.plus(ONE, TWO);
        assertEquals(ONE + TWO, result);
    }

    @Test
    public void plusTest2() {
        int result = calculatorService.plus(THREE, ONE);
        assertEquals(THREE + ONE, result);
    }

    @Test
    public void minusTest1() {
        int result = calculatorService.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }

    @Test
    public void minusTest2() {
        int result = calculatorService.minus(THREE, ONE);
        assertEquals(THREE - ONE, result);
    }

    @Test
    public void multiplyTest1() {
        int result = calculatorService.multiply(TWO, ONE);
        assertEquals(TWO * ONE, result);
    }

    @Test
    public void multiplyTest2() {
        int result = calculatorService.multiply(THREE, ONE);
        assertEquals(THREE * ONE, result);
    }

    @Test
    public void divideTest1() {
        double result = calculatorService.divide(THREE, ONE);
        assertEquals(THREE / ONE, result);
    }

    @Test
    public void divideTest2() {
        double result = calculatorService.divide(TWO, ONE);
        assertEquals(TWO / ONE, result);
    }

}
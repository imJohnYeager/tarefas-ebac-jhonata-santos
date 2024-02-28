package com.jyeager.tarefa02.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacciZero() {
        assertEquals(0, Fibonacci.freqFibonacci(0));
    }

    @Test
    public void testFibonacciUm() {
        assertEquals(1, Fibonacci.freqFibonacci(1));
    }

    @Test
    public void testFibonacciCinco() {
        assertEquals(5, Fibonacci.freqFibonacci(5));
    }
}
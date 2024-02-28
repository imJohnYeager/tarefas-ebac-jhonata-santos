package com.jyeager.tarefa02.fibonacci;

public class Fibonacci {

    public static int freqFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return freqFibonacci(n - 1) + freqFibonacci(n - 2);
        }
    }
}

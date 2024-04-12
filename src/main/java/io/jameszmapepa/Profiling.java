package io.jameszmapepa;


public class Profiling
{
    public static void main(String[] args) {
        for (int i = 0; i < 45; i++) {
            long startTime = System.currentTimeMillis();
            long fibValue = fibonacci(i);
            long endTime = System.currentTimeMillis();
            System.out.println("Fibonacci(" + i + ") = " + fibValue + "; Time taken: " + (endTime - startTime) + " ms");
        }
    }

    // A simple recursive method to calculate Fibonacci numbers
    private static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }}

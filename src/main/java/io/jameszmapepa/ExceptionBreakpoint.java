package io.jameszmapepa;


public class ExceptionBreakpoint
{
    public static void main(String[] args) {
        try {
            // Simulating a division by zero exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {

        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }}

package io.jameszmapepa;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamDebugging
{

    public static void main(String[] args) {
        Integer[] numbers = {1,18,2,6,3,4,5,6,15,6,7,8,9,10,11,3,6,12,13,14,15,16,1,16,7,17,18,19};


       Integer[] oddPrimeNumbersGreaterThanFive= Stream.of(numbers)
               .distinct().sorted().filter(i -> i % 2 != 0).filter(i->i>4).filter(i-> isPrime(i))
               .toArray(Integer[]::new);

        System.out.println("Even prime numbers greater than four :"+ Arrays.toString(oddPrimeNumbersGreaterThanFive));
    }

    public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    return IntStream.rangeClosed(2, (int) Math.sqrt(number))
            .allMatch(n -> number % n != 0);
}


}

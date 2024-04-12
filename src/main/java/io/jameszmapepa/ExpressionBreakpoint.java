package io.jameszmapepa;

import java.util.ArrayList;
import java.util.List;

public class ExpressionBreakpoint {

    public static void main(String[] args) {
        List<String> largeList = new ArrayList<>();
        System.out.println("Start adding elements to the list...");

        for (int i = 0; i < 1_000_000; i++) {
            // Creating a new String for each iteration to ensure that they are distinct objects
            largeList.add(new String("Element " + i));
            if (i % 100000 == 0) {
                System.out.println("Added " + i + " elements");
            }
        }

        System.out.println("List processing complete. Size of list: " + largeList.size());

        // This line is to prevent the JVM from considering largeList as a candidate for garbage collection immediately
        try {
            Thread.sleep(10000); // sleep for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

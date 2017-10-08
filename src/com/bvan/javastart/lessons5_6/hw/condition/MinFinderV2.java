package com.bvan.javastart.lessons5_6.hw.condition;

/**
 * @author bvanchuhov
 */
public class MinFinderV2 {

    public static void main(String[] args) {
        // Input
        int a = 10;
        int b = 10;

        // BL
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        // Output
        System.out.println("min = " + min);
    }
}

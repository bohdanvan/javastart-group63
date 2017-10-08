package com.bvan.javastart.lessons5_6.hw.condition;

/**
 * @author bvanchuhov
 */
public class MinMaxFinder {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}

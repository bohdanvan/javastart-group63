package com.bvan.javastart.lessons7_8;

/**
 * @author bvanchuhov
 */
public class Factorial {

    public static void main(String[] args) {
        long x = factorial(5); // Client
        long y = factorial(4);
        System.out.println(x + y);
    }

    // Creator
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative factorial arg: " + n);
        }

        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}

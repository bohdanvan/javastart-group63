package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class DigitsPrinter {

    public static void main(String[] args) {
        int n = 23;

        System.out.println(n % 100000 / 10000);
        System.out.println(n % 10000 / 1000);
        System.out.println(n % 1000 / 100);
        System.out.println(n % 100 / 10);
        System.out.println(n % 10);

        System.out.println();

        System.out.println(n / 10000 % 10);
        System.out.println(n / 1000 % 10);
        System.out.println(n / 100 % 10);
        System.out.println(n / 10 % 10);
        System.out.println(n % 10);
    }
}

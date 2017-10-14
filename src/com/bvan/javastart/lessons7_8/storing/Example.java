package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class Example {

    public static void main(String[] args) {
        int x = 10;
        x = inc(x);

        System.out.println("x = " + x);
    }

    public static int inc(int x) {
        return x + 1;
    }
}

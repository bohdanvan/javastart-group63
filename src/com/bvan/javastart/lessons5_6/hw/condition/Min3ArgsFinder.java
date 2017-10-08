package com.bvan.javastart.lessons5_6.hw.condition;

/**
 * @author bvanchuhov
 */
public class Min3ArgsFinder {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;

//        int min;
//        if (a < b && a < c) {
//            min = a;
//        } else if (b < a && b < c) {
//            min = b;
//        } else {
//            min = c;
//        }

        System.out.println("min = " + min);
    }
}

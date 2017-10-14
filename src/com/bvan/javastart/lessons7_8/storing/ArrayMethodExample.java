package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayMethodExample {

    public static void main(String[] args) {
        int[] a = new int[5];
        fill(a, 42);
        System.out.println(Arrays.toString(a));
    }

    public static void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}

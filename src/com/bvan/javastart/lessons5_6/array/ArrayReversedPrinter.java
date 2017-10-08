package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayReversedPrinter {

    public static void main(String[] args) {
        int[] array = {10, 30, 20, 50};
        System.out.println(Arrays.toString(array));

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

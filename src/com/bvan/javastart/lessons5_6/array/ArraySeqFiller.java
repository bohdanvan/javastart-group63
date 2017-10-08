package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySeqFiller {

    public static void main(String[] args) {
        int[] array = new int[5];

        int filler = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
            filler += 10;
        }

        System.out.println(Arrays.toString(array));
    }
}

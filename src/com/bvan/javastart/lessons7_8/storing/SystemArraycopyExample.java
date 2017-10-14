package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class SystemArraycopyExample {

    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = new int[4];

        System.arraycopy(a, 1, b, 0, 2);

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}

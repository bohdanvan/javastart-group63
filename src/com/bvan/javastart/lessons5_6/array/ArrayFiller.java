package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        System.out.print("Enter filler: ");
        int filler = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }

        System.out.println(Arrays.toString(array));
    }
}

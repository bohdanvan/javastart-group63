package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class StrangeSquareV5 {

    public static void main(String[] args) {
        int size = 4;

        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

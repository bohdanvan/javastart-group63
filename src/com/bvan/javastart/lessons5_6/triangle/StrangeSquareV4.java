package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class StrangeSquareV4 {

    public static void main(String[] args) {
        int size = 4;

        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

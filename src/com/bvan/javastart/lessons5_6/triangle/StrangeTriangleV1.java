package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class StrangeTriangleV1 {

    public static void main(String[] args) {
        int size = 4;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package com.bvan.javastart.lessons5_6.method.triangle;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
//        printTriangle(-1);

        printTriangle(4);
    }

    public static void printTriangle(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        for (int count = 1; count <= size; count++) {
            printLine(count);
        }
    }

    public static void printLine(int count) {
        for (int n = 1; n <= count; n++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

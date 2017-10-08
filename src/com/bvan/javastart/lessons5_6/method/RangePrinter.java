package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class RangePrinter {

    public static void main(String[] args) {
        printRange(10, 20);
        printRange(5, 1);
    }

    public static void printRange(int first, int last) {
        for (int n = first; n <= last; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

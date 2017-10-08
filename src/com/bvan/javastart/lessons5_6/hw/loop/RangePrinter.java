package com.bvan.javastart.lessons5_6.hw.loop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RangePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter from: ");
        int from = scanner.nextInt();

        System.out.print("Enter to: ");
        int to = scanner.nextInt();

        for (int n = from; n <= to; n++) {
            System.out.println(n);
        }
    }
}

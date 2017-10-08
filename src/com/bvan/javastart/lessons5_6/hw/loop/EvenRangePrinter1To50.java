package com.bvan.javastart.lessons5_6.hw.loop;

/**
 * @author bvanchuhov
 */
public class EvenRangePrinter1To50 {

    public static void main(String[] args) {
        for (int n = 2; n <= 50; n += 2) {
            System.out.println(n);
        }

        for (int n = 1; n <= 50; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}

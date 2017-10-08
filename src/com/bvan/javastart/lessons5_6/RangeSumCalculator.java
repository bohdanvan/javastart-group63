package com.bvan.javastart.lessons5_6;

/**
 * @author bvanchuhov
 */
public class RangeSumCalculator {

    public static void main(String[] args) {
        int from = 0;
        int to = 100;

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }

        System.out.println("sum = " + sum);
    }
}

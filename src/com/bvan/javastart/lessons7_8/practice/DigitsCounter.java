package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class DigitsCounter {

    public static void main(String[] args) {
        System.out.println(countDigits(247) == 3); // 3
        System.out.println(countDigits(0) == 1); // 1
        System.out.println(countDigits(-7263) == 4); // 4
        System.out.println(countDigits(1988) == 4); // 4
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

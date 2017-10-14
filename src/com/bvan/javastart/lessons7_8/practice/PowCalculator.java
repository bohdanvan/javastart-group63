package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class PowCalculator {

    public static void main(String[] args) {
        double x = pow(2, -3);
        System.out.println(x);
    }

    public static double pow(double base, int exp) {
        double res = 1.0;

        boolean isNegativeExp = exp < 0;
        if (isNegativeExp) {
            exp *= -1;
        }

        for (int n = 1; n <= exp; n++) {
            res *= base;
        }

        return isNegativeExp ? (1 / res) : res;
    }
}

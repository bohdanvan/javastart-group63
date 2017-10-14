package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class IntMethodExample {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int s = sum(x, y);
        System.out.println(s); // 30
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}

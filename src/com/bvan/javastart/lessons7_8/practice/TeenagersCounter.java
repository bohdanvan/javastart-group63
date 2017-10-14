package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class TeenagersCounter {

    public static void main(String[] args) {
        System.out.println(countTeenagers(new int[]{10, 50, 15, 13, 100}) == 2);
        System.out.println(countTeenagers(new int[]{10, 50, 15, 100}) == 1);
        System.out.println(countTeenagers(new int[]{10, 50, 100}) == 0);
    }

    public static int countTeenagers(int[] ages) {
        int count = 0;
        for (int age : ages) {
            if (isTeenager(age)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isTeenager(int age) {
        return age >= 12 && age <= 18;
    }
}

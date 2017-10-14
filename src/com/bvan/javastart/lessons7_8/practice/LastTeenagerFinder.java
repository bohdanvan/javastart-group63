package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class LastTeenagerFinder {

    public static void main(String[] args) {
        System.out.println(findLastTeenager(new int[]{10, 50, 15, 13, 100}) == 13);
        System.out.println(findLastTeenager(new int[]{10, 50, 15, 100}) == 15);
        System.out.println(findLastTeenager(new int[]{10, 50, 100}) == -1);
    }

    /**
     * Find last teenager age from the specified ages.
     * @param ages array of ages.
     * @return last teenager age or -1 if teenager age is not found.
     */
    public static int findLastTeenager(int[] ages) {
        for (int i = ages.length - 1; i >= 0; i--) {
            if (isTeenager(ages[i])) {
                return ages[i];
            }
        }
        return -1;
    }

    public static boolean isTeenager(int age) {
        return age >= 12 && age <= 18;
    }
}

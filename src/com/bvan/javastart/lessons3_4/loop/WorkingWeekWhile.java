package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class WorkingWeekWhile { // 9 %

    public static void main(String[] args) {
        int day = 1; // 1

        while (day <= 5) { // 2
            System.out.println(day + " - Work");
            day++; // 3
        }

        System.out.println("Goodbye");
    }
}

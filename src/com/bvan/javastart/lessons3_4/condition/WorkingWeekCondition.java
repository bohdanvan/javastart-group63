package com.bvan.javastart.lessons3_4.condition;

/**
 * @author bvanchuhov
 */
public class WorkingWeekCondition {

    public static void main(String[] args) {
        int day = 6; // day = 1..7

        if (day <= 5) {
            System.out.println("Work");
        } else {
            System.out.println("Friends");
        }

        System.out.println("Java Courses");
    }
}

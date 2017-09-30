package com.bvan.javastart.lessons3_4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class MovieCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rating: ");
        double rating = scanner.nextDouble();

        System.out.print("Enter price: ");
        long price = scanner.nextLong();

        if (rating > 7.8 || price <= 40) {
            System.out.println("Go the cinema");
        } else {
            System.out.println("Do not go the cinema");
        }
    }
}

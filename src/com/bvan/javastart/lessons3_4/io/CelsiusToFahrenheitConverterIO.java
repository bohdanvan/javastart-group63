package com.bvan.javastart.lessons3_4.io;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class CelsiusToFahrenheitConverterIO {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter celsius: ");
        double celsius = scanner.nextDouble();

        // BL
        double fahrenheit = (celsius * 1.8) + 32;

        // Output
        System.out.println(celsius + "°C -> " + fahrenheit + " °F");
    }
}

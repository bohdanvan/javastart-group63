package com.bvan.javastart.lessons3_4.type.boolean_type;

/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        long ticketPrice = 125;
        boolean goingToCinema = ticketPrice <= 100;

        System.out.println(goingToCinema);

        int x = 10;
        System.out.println(x < 20); // T
        System.out.println(x >= 5); // T
        System.out.println(x <= 9); // F
        System.out.println(x == 30); // F
        System.out.println(x != 30); // T
    }
}

package com.bvan.javastart.lessons3_4.type.object_type;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented,[14] and specifically designed to have as few implementation dependencies as possible.";

        int length = s.length();
        System.out.println(length); // 4

        char c = s.charAt(2);
        System.out.println("c = " + c);

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar);

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        boolean startsWithX = s.startsWith("X");
        System.out.println("startsWithX = " + startsWithX);

        int indexOfProgramming = s.indexOf("programming");
        System.out.println("indexOfProgramming = " + indexOfProgramming);

        String reversedString = new StringBuilder(s).reverse().toString();
        System.out.println("reversedString = " + reversedString);
    }
}

package com.bvan.javastart.lessons3_4.type.char_type;

/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        String s = "I ❤ Java ☺ \uD83D\uDC8B ☕ ❀ \uD83D\uDE01 \uD83D\uDE0D";
        System.out.println(s);

        char c1 = 'a';
        char c2 = '\n';
        char c3 = '\u2764';
        char c4 = 10000;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        // "D:\\"
        System.out.println("\"D:\\\\\"");
    }
}

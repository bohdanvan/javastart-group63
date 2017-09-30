package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class LikesStatistic {

    public static void main(String[] args) {
        long likesCount = 707; // number of likes
        int registrationYear = 2007; //registration year
        int currentYear = java.time.Year.now().getValue();

        double likesPerYear = (double)likesCount / (currentYear - registrationYear);

        System.out.println(likesPerYear + " likes/year");
    }
}

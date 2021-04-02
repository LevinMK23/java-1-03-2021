package lesson2.homework;

import java.util.GregorianCalendar;

public class HomeWork {

    public static boolean isSumBetween(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printSign(int value) {
        if (value >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isNegative(int value) {
        return value > 0;
    }

    public static void printNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeap(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }

}

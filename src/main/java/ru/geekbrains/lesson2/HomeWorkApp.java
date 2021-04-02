package ru.geekbrains.lesson2;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        casIn10and20();
    }

    // проверка вхождения введенных данных в диапазон
    private static boolean casIn10and20() {
        Scanner in = new Scanner(System.in);
        System.out.print("введите первое число......:");
        int x1 = in.nextInt();
        System.out.print("введите второе число......:");
        int x2 = in.nextInt();
        in.close();
        boolean s = x1 + x2 >= 10 && x1 + x2 <= 20;
        System.out.println(s);
        return s;
    }
}



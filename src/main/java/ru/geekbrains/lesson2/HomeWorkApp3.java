package ru.geekbrains.lesson2;

import java.util.Scanner;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        isNotNull();
    }

    // проверка цисла на положительность
    private static void isNotNull() {
        Scanner in = new Scanner(System.in);
        System.out.print("введите цисло......:");
        int x = in.nextInt();
        in.close();
        System.out.println(x < 0);
    }

}
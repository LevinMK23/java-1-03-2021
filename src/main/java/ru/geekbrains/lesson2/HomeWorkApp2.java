package ru.geekbrains.lesson2;

import java.util.Scanner;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        isNotNull();
    }

    // проверка цисла на положительность
    private static void isNotNull() {
        Scanner in = new Scanner(System.in);
        System.out.print("введите число......:");
        int x = in.nextInt();
        in.close();
        if (x >= 0) {
            System.out.println("Введено положительное число");
        } else {
            System.out.println("Введено отрицательное число");
        }
    }

}
package ru.geekbrains.lesson2;

import java.util.Scanner;

public class HomeWorkApp4 {
    public static void main(String[] args) {

        printWord();
    }

    public static void printWord() {
        Scanner in = new Scanner(System.in);
        System.out.print("введите слово......:");
        String word = String.valueOf(in.nextLine());
        System.out.print("введите цисло......:");
        int x = in.nextInt();
        in.close();

        for (int n = 0; n < x; n++) {
            System.out.println(word);
        }
    }
}

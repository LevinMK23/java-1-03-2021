package lesson3;

import java.util.Scanner;

public class GuessDigit {

    // компьютер загадывает случайное число
    // а мы должны его угадать

    private static int getRandomDigit() {
        return (int) (Math.random() * 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = getRandomDigit();
        System.out.println("Я загадал число от 0 до 9");
        System.out.println("Попробуй угадать его за три попытки");
        System.out.println("Просто вводи числа, а я буду говорить больше или меньше");
        int tryCount = 3;
        for (int i = 0; i < tryCount; i++) {
            System.out.println("Попытка " + (i + 1) + ":");
            int current = in.nextInt();
            if (current < guess) {
                System.out.println("Мое число больше");
            } else if (current > guess) {
                System.out.println("Мое число меньше");
            } else {
                System.out.println("Ты победил, я действительно загадал: " + guess);
            }
        }

    }

}

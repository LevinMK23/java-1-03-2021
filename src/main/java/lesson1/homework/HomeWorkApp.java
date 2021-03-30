package lesson1.homework;

public class HomeWorkApp {

    static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(5, -11);
        printColor(-214);
        printColor(0);
        printColor(100);
        compareNumbers(10, 3);
    }
}

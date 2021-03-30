package lesson1;

public class Functions {

    // camelCase
    // countOfCat
    // sumOfTwoDigits

    static void printMenu() {
        System.out.println("Вы находитесь в главном меню");
        System.out.println("1. Посчитать сумму двух чисел");
        System.out.println("2. Посчитать разность двух чисел");
        System.out.println("3. Посчитать произведение двух чисел");
        System.out.println("4. Посчитать частное двух чисел");
        System.out.println("0. Выход");
        System.out.println("Введите число:");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static long foo(int x) {
        return x;
    }

    static int foo1(long x) {
        return (int) x;
    }

    static byte cast(int x) {
        return (byte) x;
    }

    static void printHello(String word) {
        System.out.println("Hello " + word);
    }

    public static void main(String[] args) {
        // printMenu();
        System.out.println(sum(1, 3));
        System.out.println(cast(129));
        printHello("Mike");
    }
}

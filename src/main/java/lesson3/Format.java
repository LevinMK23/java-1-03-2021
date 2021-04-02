package lesson3;

public class Format {

    static void printAll(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    static int foo(int a) {
        return a + 1;
    }

    static int foo(int a, int b) {
        return a + b;
    }

    static float foo(float x) {
        return x / 2;
    }

    static int foo(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    public static void main(String[] args) {
        String name = "Mike";
        int age = 30;
        System.out.printf("My name is %s, i'm %d years old\n", name, age);
        String format = String.format("My name is %s, i'm %d years old\n", name, age);
        System.out.println(format);
        printAll("1", "123", "124", "124124", "12414");

        System.out.println(foo(1, 2, 3));
    }
}

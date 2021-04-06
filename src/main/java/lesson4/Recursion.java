package lesson4;

public class Recursion {

    static void printN(int n) {
        if (n == 0) {
            return;
        }
        printN(n - 1);
        System.out.println("*");
    }

    public static void main(String[] args) {
        printN(5);
    }

}

package lesson2;

public class Cycles {

    static void printTextNTimes(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    static void printUseWhile(int n) {
        int i = 0;
        while (i < n) {
            System.out.print(" * ");
            i++;
        }

//        do {
//
//            i++;
//        } while (i < n);

    }

    // ()(())((()))(((()))) n = 4
    static void printBracketsSequence(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("(");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(")");
            }
        }
        System.out.println();
    }

    // break - аварийное прерывание цикла
    // continue - аварийный переход к следующей итерации цикла
    // ()(())((()))((......... вывести первые N скобок
    static void printFirstNBrackets(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException(
                    "param n should be positive, but now n = " + n);
        }

        int begin = 1;

        while (true) {
            for (int i = 0; i < begin; i++) {
                System.out.print("(");
                n--;
                if (n == 0) {
                    return;
                }
            }
            for (int i = 0; i < begin; i++) {
                System.out.print(")");
                n--;
                if (n == 0) {
                    return;
                }
            }
            begin++;
        }
    }


    public static void main(String[] args) {
        printTextNTimes("Hello", 5);
        printUseWhile(10);
        System.out.println();
        printBracketsSequence(5);
        printFirstNBrackets(123);
        System.out.println();
    }
}

package lesson3.hw;

import java.util.Arrays;

public class HomeWork {


    static void replace(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] + 1) % 2;
            // 0 0 1 1
            // 1 1 0 0
        }
    }

    static void fillMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            // 1 0 1   i + j = 3 - 1 -> j = 3 - i - 1
            // 0 1 0
            // 1 0 1
            m[i][i] = m[i][m.length - i - 1] = 1;
        }
    }

    static boolean hasBalance(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        if (sum % 2 == 1) {
            return false;
        }
        int leftSum = 0;
        for (int i = 0; i < a.length; i++) {
            leftSum += a[i];
            if (leftSum * 2 == sum) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.print("| ");
                for (int j = i + 1; j < a.length; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
                return true;
            }
        }
        return false;
    }

    static void shift(int[] array, int n) {
        // 1 2 3 4 -> 1
        // 2 3 4 1
        // 1 2 3 4 <- 1
        // 4 1 2 3
        // 1 2 3 4 -> 3
        // 4 1 2 3
        // n = len - n
        int len = array.length;
        // len = 5, n = -17
        // -17 % 5 = -2
        // (5 - 2) % 5 = 3

        // len = 5, n = 17
        // 17 % 5 = 2
        // (5 + 2) % 5 = 2
        n = (len + n % len) % len;
        for (int i = 0; i < n; i++) {
            int first = array[0];
            // 1 2 3 4
            // 2 3 4
            for (int j = 0; j < len - 1; j++) {
                array[j] = array[j + 1];
            }
            array[len - 1] = first;
        }
    }


    public static void main(String[] args) {
        int[][] m = new int[6][6];
        fillMatrix(m);
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                System.out.print(m[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(hasBalance(new int[]{1, 2, 4, 3, 3, 1, 1, 1, 1, 4, 2, 5}));
        for (int i = -5; i < 6; i++) {
            int[] a = new int[]{1, 2, 3, 4, 5};
            shift(a, i);
            System.out.println(Arrays.toString(a));
        }
    }

}

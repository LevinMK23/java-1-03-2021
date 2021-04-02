package lesson3;

import java.util.Arrays;

public class RandomArrayStats {

    // Math.random() -> (0, 1)
    // 0.1241257612581265
    static int[] generateRandomArray(int len, int bound) {
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = (int) (Math.random() * bound);
        }
        return a;
    }

    static void printStats(int[] array) {
        int sum = 0;
        int min = array[0];
        int max = array[0];
        // 0 1 2 3 4 5 3 2 1
        for (int item : array) {
            sum += item;
            min = Math.min(min, item);
            max = Math.max(max, item);
        }
        // %d int, long, short, byte
        // %f float, double
        // %c char
        // %s String
        System.out.println(Arrays.toString(array));
        System.out.printf("sum=%d\n",sum);
        System.out.printf("min=%d\n",min);
        System.out.printf("max=%d\n",max);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            printStats(generateRandomArray(30, 10));
        }
    }

}

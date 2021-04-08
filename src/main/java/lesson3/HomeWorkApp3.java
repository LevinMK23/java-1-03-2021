package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp3 {


    public static void main(String[] args) {
        mirrorArray();
        bigArray();
        multiplicationArray();
        zeroDiagonal();
        creatArr();
        minmaxArr();
    }

    //зеркальный массив
    public static void mirrorArray() {
        int[] arr = {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        {
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //массив от 0 до 100
    public static void bigArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }

    //умножение чисел меньше 6
    public static void multiplicationArray() {
        int[] arr = {3, 6, 9, 2, 11, 4, 8, 4, 7, 3, 9, 1, 5, 9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }

        }
        {
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //матрица крест накрест
    private static void zeroDiagonal() {
        int x = 0;
        int[][] arr = new int[6][6];
        int s2 = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + " ");

            }
        }
        {
            System.out.println();
        }

        int t = 0;
        int n = 1;
        int d = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {

            arr[i][t] = n;
            arr[t][d] = n;
            t++;
            d--;
        }


        for (int i = 0; i < arr.length; i++) {

            System.out.println(" ");
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + " ");

            }
        }

    }


    // создание массива по запросу
    private static void creatArr() {
        Scanner number = new Scanner(System.in);
        System.out.print("Введите размер строчного массива......:");
        int len = number.nextInt();
        System.out.print("Введите значение в массив ......:");
        int initialValue = number.nextInt();
        number.close();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + "  ");
        }


    }

    // поиск максимального значения
    private static void minmaxArr() {
        Random rand = new Random();
        int arr[] = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Минимальное число массива:" + min);
        System.out.println("Максимальное число массива:" + max);
    }


}

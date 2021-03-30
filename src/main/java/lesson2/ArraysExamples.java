package lesson2;

public class ArraysExamples {

    static long getArraySum(int[] array) {
        long sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    //  1 2 3 4 3 2 8 7 1 (набор высот)
    //0 1 1 1 1 1 6 1 6
    //0 1 1 1 1 1 6 6
    // Найти максимальное изменение высоты
    static int getMaxHeightDifference(int[] heights) {
        int maxDifference = 0, difference;
        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i] > heights[i + 1]) {
                difference = heights[i] - heights[i + 1];
            } else {
                difference = heights[i + 1] - heights[i];
            }
            if (difference > maxDifference) {
                maxDifference = difference;
            }
        }
        return maxDifference;
    }

    // 1 2 3 1 1 1 1 2 2 2 3 3 3 3 3 3 3
    // 1 1 1 1 2 3 4 1 2 3 1 2 3 4 5 6 7
    // 1 1 1 1 2 3 4 4 4 4 4 4 4 4 5 6 7
    static int getMaxRepeat(int[] array) {
        int cnt = 1, maxRepeat = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                cnt++;
                maxRepeat = Math.max(cnt, maxRepeat);
            } else {
                cnt = 1;
            }
        }
        return maxRepeat;
    }

    static int getMaxHeightDifferenceV2(int[] heights) {
        int maxDifference = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            maxDifference = Math.max(
                    maxDifference,
                    Math.abs(heights[i] - heights[i + 1])
            );
        }
        return maxDifference;
    }


    public static void main(String[] args) {
        int[] array = new int[10];
        // 0 0 0 5 0 0 0 0 0 0
        // 0 1 2 3 4 5 6 7 8 9
        //      a[3]
        // a[3] = 5
        String[] strings = new String[5];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "str" + (i + 1);
        }
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(getArraySum(new int[]{1, 2, 3, 4, 5}));
        System.out.println(getMaxHeightDifference(new int[]{1, 5, 22, 7, 0, 11}));
        System.out.println(getMaxRepeat(new int[]{1, 1, 1, 2, 2, 0, 2, 2, 2, 2, 1, 1}));

    }
}

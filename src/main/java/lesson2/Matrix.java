package lesson2;

public class Matrix {

    static int getMaxRowOrColumnSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            maxSum = Math.max(maxSum, rowSum);
            int columnSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                columnSum += matrix[j][i];
            }
            maxSum = Math.max(maxSum, columnSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[][] m = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = (i + j);
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int[][] test = new int[][]{
                {1, 2, 9},
                {1, 10, 1},
                {1, 7, 41}
        };
        System.out.println(getMaxRowOrColumnSum(test));
    }
}

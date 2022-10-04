package MultidimensionalArraysEX;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = dimensions[0];
        int col = dimensions[1];

        int[][] matrix = new int[row][col];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[][] maxSumMatrix = new int[3][3];
        int maxSum = Integer.MIN_VALUE;
        for (int r = 0; r <matrix.length - 2; r++) {
            for (int c = 0; c < matrix[r].length - 2; c++) {

                int sum = matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 2]
                        + matrix[r + 1][c] + matrix[r + 1][c + 1] + matrix[r + 1][c + 2]
                        + matrix[r + 2][c] + matrix[r + 2][c + 1] + matrix[r +2][c + 2];

                if (sum > maxSum){
                    maxSum = sum;

                    maxSumMatrix[0][0] = matrix[r][c]; maxSumMatrix[0][1] = matrix[r][c + 1]; maxSumMatrix[0][2] = matrix[r][c + 2];
                    maxSumMatrix[1][0] = matrix[r + 1][c]; maxSumMatrix[1][1] = matrix[r + 1][c + 1]; maxSumMatrix[1][2] = matrix[r + 1][c + 2];
                    maxSumMatrix[2][0] = matrix[r + 2][c]; maxSumMatrix[2][1] = matrix[r + 2][c + 1];maxSumMatrix[2][2] = matrix[r + 2][c + 2];

                }
            }
        }
        System.out.println("Sum = " + maxSum);
        matrixPrinter(maxSumMatrix);
    }

    private static void matrixPrinter(int[][] maxSumMatrix) {
        for (int[] arr : maxSumMatrix) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

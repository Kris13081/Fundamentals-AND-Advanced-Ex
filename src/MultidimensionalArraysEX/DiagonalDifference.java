package MultidimensionalArraysEX;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }


        int row = 0;
        int col = 0;
        int firsDiagonalSum = 0;
        int secondDiagonalSum = 0;

        while (row < matrix.length && col < matrix[row].length) {
            firsDiagonalSum += matrix[row][col];
            row++;
            col++;
        }
        row = matrix.length - 1;
        col = 0;

        while (row >= 0 && col < matrix[row].length) {
            secondDiagonalSum += matrix[row][col];
            row--;
            col++;
        }

        printingDifference(firsDiagonalSum, secondDiagonalSum);
    }

    private static void printingDifference(int firsDiagonalSum, int secondDiagonalSum) {
        if (firsDiagonalSum > secondDiagonalSum) {
            System.out.println(firsDiagonalSum - secondDiagonalSum);
        }else {
            System.out.println(secondDiagonalSum - firsDiagonalSum);
        }
    }
}

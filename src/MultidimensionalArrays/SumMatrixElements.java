package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                 .mapToInt(Integer::parseInt)
                 .toArray();

         int[][] matrix = new int[dimensions[0]][dimensions[1]];
        System.out.println(dimensions[0]);
        System.out.println(dimensions[1]);

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int sum = 0;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
        }
        System.out.println(sum);
    }
}

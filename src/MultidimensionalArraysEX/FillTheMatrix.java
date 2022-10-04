package MultidimensionalArraysEX;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputInfo = scanner.nextLine().split(", ");
        int matrixSize = Integer.parseInt(inputInfo[0]);
        String pattern = inputInfo[1];

        int[][] matrix = new int[matrixSize][matrixSize];


        if (pattern.equals("A")){
            patternA(matrix);
        }else if (pattern.equals("B")){
            patternB(matrix);
        }

        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    private static void patternB( int[][] matrix) {
        int counter = 1;

        for (int c = 0; c < matrix.length; c++) {
            if (c % 2 == 0){
                    for (int r = 0; r < matrix[c].length; r++) {
                        matrix[r][c] = counter;
                        counter++;
                }
            }else {
                for (int r = matrix.length - 1; r >= 0; r--) {
                    matrix[r][c] = counter;
                    counter++;
                }
            }
        }
    }

    private static void patternA( int[][] matrix) {
        int counter = 1;

        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix[c].length; r++) {
                matrix[r][c] = counter;
                counter++;
            }
        }
    }
}

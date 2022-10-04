package MultidimensionalArrays;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int arrayCount = scanner.nextInt();
        int sizeOfArray = scanner.nextInt();

        int[][] firstMatrix = new int[arrayCount][sizeOfArray];

        for (int r = 0; r < arrayCount; r++) {
            for (int c = 0; c < sizeOfArray; c++) {
                firstMatrix[r][c] = scanner.nextInt();
            }
        }
        arrayCount = scanner.nextInt();
        sizeOfArray = scanner.nextInt();

        int[][] secondMatrix = new int[arrayCount][sizeOfArray];

        for (int r = 0; r < secondMatrix.length; r++) {
            for (int c = 0; c < secondMatrix[r].length; c++) {
                secondMatrix[r][c] = scanner.nextInt();
            }
        }
        boolean areEqual = firstMatrix.length == secondMatrix.length
                            && areArraysEqual(firstMatrix, secondMatrix);

        System.out.println(areEqual ?"equal":"not equal");
}

    private static boolean areArraysEqual(int[][] firstMatrix, int[][] secondMatrix) {


        for (int r = 0; r < firstMatrix.length; r++) {

            int[] firstArr = firstMatrix[r];
            int[] secondArr = secondMatrix[r];

            if (firstArr.length != secondArr.length) {
                return false;
            }
            for (int i = 0; i < firstArr.length; i++) {
                int firstNumber = firstArr[i];
                int secondNumber = secondArr[i];

                if (firstNumber != secondNumber) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int num : arr) {
                System.out.println(num + " ");
            }
            System.out.println();

        }
    }
}



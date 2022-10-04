package MultidimensionalArraysEX;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = input[0];
        int col = input[1];

        String[][] matrix = new String[row][col];

        movingLetters(matrix);

        for (String[] arr : matrix) {
            for (String s : arr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    private static void movingLetters(String[][] matrix) {
        char startingLetter = 'a';

        for (int r = 0; r < matrix.length; r++) {
            char outerLetter = (char) (startingLetter + r);
            for (int c = 0; c < matrix[r].length; c++) {
                char middleLetter = (char) (startingLetter + r + c);
                matrix[r][c] = "" + outerLetter + middleLetter + outerLetter;
            }
        }
    }
}

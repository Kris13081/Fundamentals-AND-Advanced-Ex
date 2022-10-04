package MultidimensionalArraysEX;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = dimensions[0];
        int col = dimensions[1];

        String[][] matrix = new String[row][col];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = scanner.nextLine().split(" ");

        }
        String input = scanner.nextLine();
        while (!input.equals("END")) {

            String[] command = input.split(" ");

            if (!command[0].equals("swap") || command.length <= 1) {
                System.out.println("Invalid input!");
            } else {

                int firstRowIndex = Integer.parseInt(command[1]);
                int firstColIndex = Integer.parseInt(command[2]);
                int secondRowIndex = Integer.parseInt(command[3]);
                int secondColIndex = Integer.parseInt(command[4]);
                if (firstRowIndex > matrix.length && firstColIndex > matrix.length && secondRowIndex > matrix.length && secondColIndex > matrix.length){
                    System.out.println("Invalid input!");
                }else {
                    String valueForReplace = matrix[firstRowIndex][firstColIndex];

                    matrix[firstRowIndex][firstColIndex] = matrix[secondRowIndex][secondColIndex];
                    matrix[secondRowIndex][secondColIndex] = valueForReplace;
                    for (String[] arr : matrix) {
                        for (String n : arr) {
                            System.out.print(n + " ");
                        }
                        System.out.println();
                    }
                }
            }
            input = scanner.nextLine();
        }
    }
}

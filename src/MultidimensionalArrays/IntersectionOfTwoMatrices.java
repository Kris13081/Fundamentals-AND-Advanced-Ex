package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());   //row count
        int col = Integer.parseInt(scanner.nextLine());   //col count

        String[][] firstMatrix = new String[row][col];    //firstMatrix
        String[][] secondMatrix = new String[row][col];   //secondMatrix
        String[][] resultMatrix = new String[row][col];   //resultMatrix

        // firstMatrix read from the console
        for (int r = 0; r < firstMatrix.length; r++) {
            firstMatrix[r] = scanner.nextLine().split("\\s+");
            resultMatrix[r] = firstMatrix[r];
        }
        // secondMatrix read from the console
        for (int r = 0; r < secondMatrix.length; r++) {
            secondMatrix[r] = scanner.nextLine().split("\\s+");
        }
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                String first = firstMatrix[i][j];
                String second = secondMatrix[i][j];

                if (first.equals(second)){
                    resultMatrix[i][j] = first;
                }else {
                    resultMatrix[i][j] = "*";
                }
            }
        }
        for (String[] matrix : resultMatrix) {
            for (String s : matrix) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}

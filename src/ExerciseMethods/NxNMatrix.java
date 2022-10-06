package ExerciseMethods;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        printNxNMatrix(n);
    }
    public static void printNxNMatrix(int n){
        for (int rolls = 0; rolls < n; rolls++) {
            for (int column = 0; column < n; column++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

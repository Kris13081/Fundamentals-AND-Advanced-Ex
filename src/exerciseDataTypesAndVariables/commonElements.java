package exerciseDataTypesAndVariables;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String second : secondArray) {

            for (String first : firstArray) {
                if (second.equals(first)) {
                    System.out.println(first + " ");
                }
            }
        }

    }
}

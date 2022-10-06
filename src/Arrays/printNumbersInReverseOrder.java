package Arrays;

import java.util.Scanner;

public class printNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputOfNumbers = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[inputOfNumbers];

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

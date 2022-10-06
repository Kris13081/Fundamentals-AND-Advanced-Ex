package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int biggestNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean founded = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    biggestNum = numbers[i];
                    founded = true;
                } else {
                    break;
                }
            }
            if (founded) {
                System.out.print(biggestNum + " ");

            }
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}




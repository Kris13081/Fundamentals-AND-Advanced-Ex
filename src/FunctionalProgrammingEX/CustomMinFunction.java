package FunctionalProgrammingEX;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        Function<int[], Integer> minimumNumber = arr -> {
            int minimum = Integer.MAX_VALUE;
            for (int number : numbers) {
                if (number <= minimum){
                    minimum = number;
                }
            }
            return minimum;
        };
        int min = minimumNumber.apply(numbers);

        System.out.println(min);

    }
}

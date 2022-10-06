package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();

        int numRepetitions  = input.length -1;
        for (int repetitions = 0; repetitions < numRepetitions ; repetitions++) {
            int[]condensed = new int[input.length - 1];
            for (int i = 0; i < input.length - 1; i++) {
                condensed[i] = input[i] + input[i + 1];
            }
            input = condensed;
        }
        System.out.println(input[0]);
    }
}

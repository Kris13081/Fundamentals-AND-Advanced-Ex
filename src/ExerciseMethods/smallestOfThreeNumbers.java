package ExerciseMethods;

import java.util.Arrays;
import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());


        int smallestNum = getSmallestNumber(first, second, third);


        System.out.println(smallestNum);
    }

    private static int getSmallestNumber(int first, int second, int third) {
        int[] numbers = {first, second, third};
        Arrays.sort(numbers);
        return numbers[0];
    }
}

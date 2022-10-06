package ExerciseMethods;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp = 0;
        int range = 0;
        String num = scanner.nextLine();


        while (!num.equals("END")) {

            System.out.println(palNumFinder(range, temp, Integer.parseInt(num)));
            num = scanner.nextLine();
        }
    }

    private static boolean palNumFinder(int range, int temp, int number) {
        int sum = 0;
        temp = number;
        while (number > 0) {
            range = number % 10;
            sum = (sum * 10) + range;
            number /= 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }
}


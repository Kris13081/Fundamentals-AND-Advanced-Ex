package ExerciseMethods;

import java.util.Arrays;
import java.util.Scanner;

public class experiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {


            String[] arr = input.split("");
           String[] reversed = arrayReversing(arr);
            boolean b = arrayComp(reversed, arr);
            if (b) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }

    }

    private static String[] arrayReversing(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }

        return arr;

    }

    public static boolean arrayComp(String[] array, String[] arr) {
        String[] reversed = arrayReversing(arr);
        if (reversed.equals(array)){
            return true;
        }
        return false;
    }
}

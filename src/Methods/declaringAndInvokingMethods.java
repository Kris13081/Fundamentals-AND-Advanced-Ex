package Methods;

import java.util.Scanner;

public class declaringAndInvokingMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        intSignFinder(input);
    }

    private static void intSignFinder(int input) {
        if (input > 0) {
            System.out.println("The number " + input + " is positive.");
        } else if (input < 0) {
            System.out.println("The number " + input + " is negative.");
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}

package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.##").format(calculate(a,operator, b)));
    }

    private static double calculate(int a, String operator, int b) {
        double result = 0.0;

        switch (operator) {
            case "+":
                result = sum(a, b);
                break;
            case "-":
                result = subtraction(a, b);
                break;
            case "*":
                result = multiplication(a, b);
                break;
            case "/":
                result = divide(a, b);
                break;
        }


        return result;

    }

    private static double divide(int a, int b) {
        return (int) (a / b);
    }

    private static double multiplication(int a, int b) {
        return a * b;
    }

    private static double subtraction(int a, int b) {
        return a - b;
    }

    private static double sum(int a, int b) {
        return a + b;
    }
}

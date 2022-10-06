package ExerciseMethods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

       double divided =  divideFactorials(findTheFactorial(first), findTheFactorial(second));
        System.out.printf("%.2f", divided);
    }

    public static double findTheFactorial(int number) {
        double fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
    private static double divideFactorials(double firstNumberFactorial, double secondNumberFactorial){
       return firstNumberFactorial / secondNumberFactorial;
    }
}

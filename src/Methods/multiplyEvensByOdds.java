package Methods;


import java.util.Arrays;
import java.util.Scanner;

public class multiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numLine = String.valueOf(Math.abs(Integer.parseInt(scanner.nextLine())));
        int[] numberArr = lineConvertor(numLine);


        int result = Math.abs(evensAndOddsMultiplication(numberArr));
        System.out.println(result);
    }

    private static int[] lineConvertor(String numLine) {
        return Arrays.stream(numLine
                        .split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int evensAndOddsMultiplication(int[] numberArr) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] % 2 == 0) {
                evenSum += numberArr[i];
            } else {
                oddSum += numberArr[i];
            }
        }
        return evenSum * oddSum;
    }
}

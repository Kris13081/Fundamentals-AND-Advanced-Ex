package Methods;

import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("int")) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            int max = getMax(firstNum, secondNum);
            System.out.println(max);
        }
        if (type.equals("char")) {
            char first = scanner.next().charAt(0);
            char second = scanner.next().charAt(0);
            System.out.println(getMax(first, second));
        }
        if (type.equals("string")) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(getMax(first, second));
        }
    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }


    private static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    private static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }
}

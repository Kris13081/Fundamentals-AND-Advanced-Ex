package ExerciseMethods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int finalSum = subtractTheThirdFromFirstAndSecond(first, second, third);
        System.out.println(finalSum);

    }
    public static int sumFirstAndSecond(int first, int second){
        return first + second;
    }
    public static int subtractTheThirdFromFirstAndSecond(int first, int second, int third){
        return sumFirstAndSecond(first, second) - third;
    }
}

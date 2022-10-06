package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();
        int[] secondArray = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean arraysAreEqual;
        int sum = 0;

        if (firstArray.length != secondArray.length){
            arraysAreEqual = false;
        }else {
            arraysAreEqual = true;
            for (int i = 0; i < firstArray.length; i++) {
                sum += firstArray[i];
                if (firstArray[i] != secondArray[i]) {
                    arraysAreEqual = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    break;
                }
            }
        }
        if (arraysAreEqual){
            System.out.printf("Arrays are identical. Sum: %d", sum);

        }
    }
}

package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListManipulationBasicsWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.asList(scanner.nextLine().split(" "));
        List<Integer> numsList = convertStringListToIntList(stringList, Integer::parseInt);

        String command = scanner.next();

        while (!command.equals("end")) {

            switch (command) {
                case "Add":
                    int num = scanner.nextInt();
                    getAddingNumberToTheEndOfTheList(numsList, num);
                    break;
                case "Remove":
                    num = scanner.nextInt();

                    numsList.remove((Integer) num);

                    break;
                case "RemoveAt":
                    int index = scanner.nextInt();
                    numsList.remove(index);
                    break;
                case "Insert":
                    int number = scanner.nextInt();
                    index = scanner.nextInt();
                    numsList.add(index, number);
                    break;
            }
            command = scanner.next();
        }
        System.out.println(numsList.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void getAddingNumberToTheEndOfTheList(List<Integer> nums1, int num) {
        nums1.add(num);
    }

    public static <T, U> List<U>
    convertStringListToIntList(List<T> listOfString,
                               Function<T, U> function) {
        return listOfString.stream()
                .map(function)
                .collect(Collectors.toList());
    }
}

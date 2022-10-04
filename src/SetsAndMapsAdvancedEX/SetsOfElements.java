package SetsAndMapsAdvancedEX;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lengths = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int lengthOne = lengths[0];
        int lengthTwo = lengths[1];

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();


        while (lengthOne-- > 0){
            int input = Integer.parseInt(scanner.nextLine());
            firstSet.add(input);
        }
        while (lengthTwo-- > 0){
            int input = Integer.parseInt(scanner.nextLine());
            secondSet.add(input);
        }
        for (Integer number : firstSet) {
            if (secondSet.contains(number)) {
                System.out.print(number + " ");
            }
        }

    }
}

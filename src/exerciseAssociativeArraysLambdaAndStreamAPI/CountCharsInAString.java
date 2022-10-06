package exerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> str = Arrays.stream(input.split("")).toList();

        Map<String, Integer> charCount = new HashMap<>();

        for (String character : str) {
            if (charCount.containsKey(character)) {
                Integer currentChar = charCount.get(character);
                charCount.put(character, currentChar + 1);
            } else {
                charCount.put(character, 1);
            }
        }
        charCount.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}

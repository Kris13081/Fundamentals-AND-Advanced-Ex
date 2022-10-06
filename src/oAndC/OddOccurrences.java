package oAndC;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words){
            String wordInLowerKey =  wordInLowerCase(word);
            if (counts.containsKey(wordInLowerCase(word))){
                counts.put(wordInLowerCase(word), counts.get(wordInLowerKey) + 1);
            } else {
                counts.put(wordInLowerKey ,1);
            }
        }
    }

    private static String wordInLowerCase(String word) {
        return word.toLowerCase();
    }
}

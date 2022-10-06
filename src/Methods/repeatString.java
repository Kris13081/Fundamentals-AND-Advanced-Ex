package Methods;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());
         String repeated = stringConc(word, repetitions);
        System.out.println(repeated);
    }

    private static String stringConc(String s, int repetitions) {
        String[] strings = new String[repetitions];
        for (int i = 0; i < strings.length; i++) {
                strings[i] = s;
        }
        String repeated = String.join("",strings);
        return repeated;
    }
}

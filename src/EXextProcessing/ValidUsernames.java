package EXextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        for (String username : input) {
            StringBuilder sb = new StringBuilder();

            if (username.length() >= 3 && username.length() <= 16) {
                for (int i = 0; i < username.length(); i++) {
                    char symbol = username.charAt(i);
                    if (Character.isLetter(symbol) || Character.isDigit(symbol) || symbol == 45 || symbol == 95) {
                        sb.append(symbol);
                    } else {
                        break;
                    }
                }
            }
            if (sb.length() == username.length()){
                System.out.println(username);
            }
        }
    }
}


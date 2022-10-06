package RetakeExam;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String command = scanner.nextLine();


        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");


            switch (tokens[0]) {
                case "TakeOdd": {
                    String temporary = "";
                    for (int i = 1; i < password.length(); i += 2) {
                        temporary += password.charAt(i);
                    }
                    password = temporary;
                    System.out.println(password);
                    break;
                }
                case "Cut": {
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    String firstPart = password.substring(0, index);
                    String secondPart = password.substring(index + length);

                    password = firstPart + secondPart;
                    System.out.println(password);
                    break;
                }
                case "Substitute": {
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    String temporary = "";

                    if (password.contains(String.valueOf(substring))) {
                        temporary = password.replaceAll(substring, substitute);
                        password = temporary;
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
                }
            }

            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);

    }
}

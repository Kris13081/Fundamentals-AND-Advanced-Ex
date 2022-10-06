import java.util.Scanner;

public class PasswordVal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder wantedPass = new StringBuilder(scanner.nextLine());

        String line = scanner.nextLine();
        while (!(line.equals("Complete"))) {
            String[] data = line.split(" ");
            String command = data[0];

            if (command.equals("Make")) {
                String command2 = data[1];
                switch (command2) {
                    case "Upper":
                        int index = Integer.parseInt(data[2]);
                        String c = String.valueOf(wantedPass.toString().toUpperCase().charAt(index));
                        wantedPass.replace(index, index + 1, c);
                        System.out.println(wantedPass);
                        break;
                    case "Lower":
                        index = Integer.parseInt(data[2]);
                        c = String.valueOf(wantedPass.toString().toLowerCase().charAt(index));
                        wantedPass.replace(index, index + 1, c);
                        System.out.println(wantedPass);
                        break;
                }
            } else {
                switch (command) {
                    case "Insert":
                        int index = Integer.parseInt(data[1]);
                        String c = data[2];
                        if (index > wantedPass.length()) {
                            break;
                        } else {
                            wantedPass.insert(index, c);
                            System.out.println(wantedPass);
                        }
                        break;
                    case "Replace":
                        String charr = data[1];

                        if (wantedPass.toString().contains(charr)) {
                            int indexOfChar = wantedPass.indexOf(charr);
                            char charVal = wantedPass.charAt(indexOfChar);
                            int value = Integer.parseInt(data[2]);
                            int newSummedVal = (int) charVal + value;
                            char newChar = (char) newSummedVal;
                            for (int i = 0; i < wantedPass.length(); i++) {
                                charr = data[1];
                                indexOfChar = wantedPass.indexOf(charr);
                                String currentChar = String.valueOf(wantedPass.charAt(i));
                                if (currentChar.equals(charr)) {
                                    wantedPass.setCharAt(indexOfChar, newChar);
                                }
                            }
                            System.out.println(wantedPass);
                        }
                        break;
                    case "Validation":
                        if (wantedPass.length() <= 8) {
                            System.out.printf("Password must be at least 8 characters long!\n");
                        } else if (isConsistOnlyLettersAndDigits(wantedPass.toString())) {
                            System.out.printf("Password must consist only of letters, digits and _!\n");
                        } else if (onlyOneUpper(wantedPass.toString())) {
                            System.out.printf("Password must consist at least one uppercase letter!\n");
                        } else if (onlyOneLower(wantedPass.toString())) {
                            System.out.printf("Password must consist at least one lowercase letter!\n");
                        } else if (onlyOneDig(wantedPass.toString())) {
                            System.out.printf("Password must consist at least one digit!\n");
                        }
                        break;
                }
            }
            line = scanner.nextLine();
        }
    }

    public static boolean isConsistOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)) {
                return false;
            }
        }
        return true;
    }

    public static boolean onlyOneUpper(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if ((symbol < 65 || symbol > 90)) {
                return false;
            }
        }
        return true;
    }

    public static boolean onlyOneLower(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if ((symbol < 97 || symbol > 122)) {
                return true;
            }
        }
        return false;
    }

    public static boolean onlyOneDig(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if ((symbol < 48 || symbol > 57)) {
                return true;
            }
        }
        return false;
    }

}
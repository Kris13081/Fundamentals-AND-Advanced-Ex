import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String line = scanner.nextLine();
        while (!line.equals("Decode")) {
            String[] date = line.split("[|]");
            String command = date[0];

            switch (command) {
                case "Move":
                    String substring = sb.substring(0, Integer.parseInt(date[1]));
                    sb.delete(0, Integer.parseInt(date[1]));
                    sb.append(substring);
                    break;
                case "Insert":
                    int index = Integer.parseInt(date[1]);
                    String value = date[2];
                    sb.insert(index, value);
                    break;
                case "ChangeAll":
                    String occurrence = date[1];
                    String replacement = date[2];
                    String replacedString = sb.toString().replace(occurrence, replacement);
                    sb.setLength(0);
                    sb.append(replacedString);
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", sb);
    }
}

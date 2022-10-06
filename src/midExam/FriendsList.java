package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> friendsList = Arrays.stream(scanner.nextLine()
                .split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        int blackListedNames = 0;
        int lostNames = 0;

        while (!command.equals("Report")) {
            String[] commandAndPerimeter = command.split(" ");


            switch (commandAndPerimeter[0]) {
                case "Blacklist":
                    if (friendsList.contains(commandAndPerimeter[1])) {
                        System.out.println(commandAndPerimeter[1] + " was blacklisted.");
                        friendsList.set(friendsList.indexOf(commandAndPerimeter[1]), "Blacklisted");
                        blackListedNames++;
                    } else {
                        System.out.println(commandAndPerimeter[1] + " was not found.");
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(commandAndPerimeter[1]);
                    if (index >= 0 && index <= friendsList.size() - 1) {
                        String username = friendsList.get(index);
                        if (friendsList.contains(username)) {
                            if (!username.equals("Blacklisted") && !username.equals("Lost")) {
                                friendsList.set(index, "Lost");
                                lostNames++;
                                System.out.println(username + " was lost due to an error.");
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(commandAndPerimeter[1]);
                    if (index >= 0 && index <= friendsList.size() - 1) {
                        String username = friendsList.get(index);
                        friendsList.set(friendsList.indexOf(username), commandAndPerimeter[2]);
                        System.out.println(username + " changed his username to " + commandAndPerimeter[2] + ".");
                    } else {
                        break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Blacklisted names: " + blackListedNames);
        System.out.println("Lost names: " + lostNames);
        for (int i = 0; i < friendsList.size(); i++) {
            System.out.print(friendsList.get(i) + " ");

        }
    }
}

package FunctionalProgrammingEX;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Party!")) {
            String[] commandParts = command.split(" ");
            String doubleOrRemove = commandParts[0];
            String commandType = commandParts[1];
            String parameter = commandParts[2];


            if (doubleOrRemove.equals("Remove")) {
                guests.removeIf(getPredicate(commandType, parameter));
            }  else if (doubleOrRemove.equals("Double")) {

                for (int i = 0; i < guests.size(); i++) {
                    String guest = guests.get(i);
                    if (getPredicate(commandType, parameter).test(guest)) {
                        guests.add(i++, guest);
                    }
                }
            }
            command = scanner.nextLine();
        }
        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guests);
            System.out.printf("%s are going to the party!%n", String.join(", ", guests));
        }
    }

    private static Predicate<String> getPredicate(String type, String parameter) {
        switch (type) {
            case "StartsWith":
                return text -> text.startsWith(parameter);
            case "EndsWith":
                return text -> text.endsWith(parameter);
            case "Length":
                return text -> text.length() == Integer.parseInt(parameter);
            default:
                return text -> false;
        }
    }
}

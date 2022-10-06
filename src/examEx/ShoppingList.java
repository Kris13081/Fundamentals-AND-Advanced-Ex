package examEx;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine()
                .split("!")).collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            String[] commandAndPerimeter = command.split(" ");


            switch (commandAndPerimeter[0]) {
                case "Urgent":
                    if (shoppingList.contains(commandAndPerimeter[1])) {
                        break;
                    } else {
                        shoppingList.add(0, commandAndPerimeter[1]);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingList.contains(commandAndPerimeter[1])) {
                        shoppingList.remove(commandAndPerimeter[1]);
                    } else {
                        break;
                    }
                    break;
                case "Correct":

                    if (shoppingList.contains(commandAndPerimeter[1])) {
                        shoppingList.set(shoppingList.indexOf(commandAndPerimeter[1]), commandAndPerimeter[2]);
                    } else {
                        break;
                    }
                    break;
                case "Rearrange":

                    if (shoppingList.contains(commandAndPerimeter[1])) {
                        shoppingList.remove(commandAndPerimeter[1]);
                        shoppingList.add(commandAndPerimeter[1]);
                    } else {
                        break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i));
            if (i < shoppingList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

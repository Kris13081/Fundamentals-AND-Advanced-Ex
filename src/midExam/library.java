package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> bookShelf = Arrays.stream(scanner.nextLine()
                .split("&")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] commandAndPerimeter = command.split(" [|] ");

            switch (commandAndPerimeter[0]) {
                case "Add Book":
                    if (!bookShelf.contains(commandAndPerimeter[1])) {
                        bookShelf.add(0, commandAndPerimeter[1]);
                    } else {
                        break;
                    }
                    break;
                case "Take Book":
                    if (bookShelf.contains(commandAndPerimeter[1])) {
                        bookShelf.remove(commandAndPerimeter[1]);
                    } else {
                        break;
                    }
                    break;
                case "Swap Books":
                    int indexOfBookTwo = bookShelf.indexOf(commandAndPerimeter[2]);
                    String bookOne = commandAndPerimeter[1];
                    String bookTwo = commandAndPerimeter[2];
                    if (bookShelf.contains(bookOne) && bookShelf.contains(bookTwo)) {
                        bookShelf.set(bookShelf.indexOf(commandAndPerimeter[1]), bookTwo);
                        bookShelf.set(indexOfBookTwo, bookOne);
                    } else {
                        break;
                    }
                    break;
                case "Insert Book":
                    if (!bookShelf.contains(commandAndPerimeter[1])) {
                        bookShelf.add(commandAndPerimeter[1]);
                    } else {
                        break;
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(commandAndPerimeter[1]);
                    if (index >= 0 && index <= bookShelf.size() - 1) {
                        String username = bookShelf.get(index);
                        System.out.println(username);
                    } else {
                        break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < bookShelf.size(); i++) {
            System.out.print(bookShelf.get(i));
            if (i < bookShelf.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

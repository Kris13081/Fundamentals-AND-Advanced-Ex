package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> list = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "Contains":
                    break;
                case "Print even":
                    break;
                case "Print odd":
                    break;
                case "Get sum":
                    break;
            }
            input = scanner.nextLine();
        }
    }
}


package ExerciseLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.next();
        while (!command.equals("end")){

            switch (command){
                case "Delete":
                    int num = Integer.parseInt(scanner.next());
                   list.removeAll(Collections.singleton(num));
                    break;
                case "Insert":
                    int element = Integer.parseInt(scanner.next());
                    int position = Integer.parseInt(scanner.next());
                    list.add(position, element);
                    break;
            }
            command = scanner.next();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}

package exerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> register = new LinkedHashMap<>();



        String line = scanner.next();
        while (n != 0) {
            String[] date = scanner.nextLine().split(" ");
           // String command = date[0];
            String name = date[1];
            String licensePlate = date[2];
                switch (line){
                    case "register":
                        register.putIfAbsent(name, new ArrayList<>());
                        register.get(name).add(licensePlate);
break;
                }
            line = scanner.next();
            n--;
        }
    }
}

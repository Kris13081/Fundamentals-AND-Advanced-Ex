package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Set<String> cars = new LinkedHashSet<>();

        while(!line.equals("END")){
            String[] input  = line.split(", ");
            String command = input[0];
            String carNumber = input[1];

            if (command.equals("IN")){
                cars.add(carNumber);
            } else {
                cars.remove(carNumber);
            }

            line = scanner.nextLine();
        }
        if (cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String car : cars) {
                System.out.println(car);
            }
        }

    }
}

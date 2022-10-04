package DefiningClasses.car;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        String input = scanner.nextLine();

        while (n-- > 0) {
            String[] carSpecs = input.split(" ");

            if ((Arrays.stream(carSpecs).collect(Collectors.toList()).size() < 3)){
                Car car = new Car(carSpecs[0]);
                carInfo(car.getBrand(), car.getModel(), car.getHorsePower());
            } else {
                Car car = new Car(carSpecs[0], carSpecs[1], Integer.parseInt(carSpecs[2]));
                carInfo(car.getBrand(), car.getModel(), car.getHorsePower());
            }

            input = scanner.nextLine();
        }
    }

    public static void carInfo(String brand, String model, int hp) {
        System.out.printf("The car is: %s %s - %d HP.%n",
                brand, model, hp);
    }
}

package DefiningClassesEX.RawData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new LinkedList<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] carInfo = scanner.nextLine().split(" ");
            String model = carInfo[0];
            int engineSpeed = Integer.parseInt(carInfo[1]);
            int enginePower = Integer.parseInt(carInfo[2]);
            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];
            double tire1Pressure = Double.parseDouble(carInfo[5]);
            int tire1Age = Integer.parseInt(carInfo[6]);
            double tire2Pressure = Double.parseDouble(carInfo[7]);
            int tire2Age = Integer.parseInt(carInfo[8]);
            double tire3Pressure = Double.parseDouble(carInfo[9]);
            int tire3Age = Integer.parseInt(carInfo[10]);
            double tire5Pressure = Double.parseDouble(carInfo[11]);
            int tire5Age = Integer.parseInt(carInfo[12]);

            Car car = new Car(model,
                    new Engine(engineSpeed, enginePower),
                    new Cargo(cargoWeight, cargoType),
                    new Tire(tire1Pressure, tire1Age,
                            tire2Pressure, tire2Age,
                            tire3Pressure, tire3Age,
                            tire5Pressure, tire5Age));
            cars.add(car);
        }
        String cargo = scanner.next();

        if (cargo.equals("fragile")) {
            cars.stream().filter(car -> car.getTire().tireWithLowerThanOnePressure(car.getTire().getTire1Pressure(),
                            car.getTire().getTire2Pressure(),
                            car.getTire().getTire3Pressure(),
                            car.getTire().getTire4Pressure()))
                    .collect(Collectors.toList())
                    .forEach(car -> {
                        if (car.getCargo().getName().equals(cargo)){
                            System.out.println(car.getModel());
                        }
                    });
        } else if (cargo.equals("flamable")) {
            cars.stream().filter(car -> car.getEngine().enginPowerBiggerThanTwoFifty(car.getEngine().getEnginePower()))
                    .collect(Collectors.toList())
                    .forEach(car -> {
                        if (car.getCargo().getName().equals(cargo)){
                            System.out.println(car.getModel());
                        }
                    });
        }
    }
}

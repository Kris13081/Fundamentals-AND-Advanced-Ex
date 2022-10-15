package ExamPrepAd;

import java.util.*;
import java.util.stream.Collectors;

public class KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> plates = new ArrayDeque<>();
        List<Integer> allPlates = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).
                collect(Collectors.toList());
        for (int i = allPlates.size() - 1; i >= 0; i--) {
            plates.push(allPlates.get(i));
        }


        ArrayDeque<Integer> cars = new ArrayDeque<>();
        List<Integer> allCars = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).
                collect(Collectors.toList());

        for (int i = allCars.size() - 1; i >= 0; i--) {
            cars.offer(allCars.get(i));
        }

        int daysCounter = 0;
        int countOfRegisteredCars = 0;
        while (!plates.isEmpty() && !cars.isEmpty()) {
            int dailyCars = cars.poll();
            int dailyPlates = plates.pop();


            int registrationPlates = dailyCars * 2;
            int willBeRegistered = dailyPlates / 2;


            if (dailyCars > dailyPlates || dailyPlates == dailyCars) {
                int remainingCars = dailyCars - willBeRegistered;
                cars.addLast(remainingCars);
                countOfRegisteredCars += willBeRegistered;
            } else {
                int remainingPlates = dailyPlates - registrationPlates;
                if (remainingPlates != 0) {
                    plates.addLast(remainingPlates);
                }
                countOfRegisteredCars += dailyCars;
            }


            daysCounter++;
        }

        System.out.printf("%d cars were registered for %d days!\n", countOfRegisteredCars, daysCounter);
        if (plates.isEmpty() && cars.isEmpty()){
            System.out.println("Good job! There is no queue in front of the KAT!");
        }
        if (!plates.isEmpty()) {
            int platesSum = 0;
            for (Integer plate : plates) {
                platesSum += plate;
            }
            System.out.printf("%d license plates remain!\n", platesSum);
        } else if (!cars.isEmpty()) {
            int carSum = 0;
            for (Integer car : cars) {
                carSum += car;
            }
            System.out.printf("%d cars remain without license plates!\n", carSum);
        }



        System.out.println();
    }
}

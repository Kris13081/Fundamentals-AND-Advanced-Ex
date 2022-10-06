package exerciseDataTypesAndVariables;

import java.util.Scanner;

public class spiceMustFlow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        startingYield = Math.abs(startingYield);
        int storage = 0;
        int daysCounter = 0;
        int nextDayYield;

        for (int i = 0; i < 100; i++) {

            if (startingYield >= 100){
                int spices = startingYield;
                nextDayYield = (startingYield - 10);
                int workersEat = spices - 26;
                storage += workersEat;
                daysCounter++;
                startingYield =nextDayYield;
            }else {
                storage -= 26;
                System.out.println(daysCounter);
                System.out.println(storage);
                break;
            }
        }
    }
}

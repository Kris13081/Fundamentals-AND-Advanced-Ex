package midExam;

import java.util.Scanner;

public class huntGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerDayFor1 = Double.parseDouble(scanner.nextLine());
        double foodPerDayFor1 = Double.parseDouble(scanner.nextLine());

        double totalWater = days * players * waterPerDayFor1;
        double totalFood = days * players * foodPerDayFor1;

        double energyLoss = Double.parseDouble(scanner.nextLine());
        int daysCounter;
        while (!(groupEnergy <= 0)) {
            for (int i = 1; i <= days; i++) {
                if (i % 2 == 0) {
                    groupEnergy = groupEnergy - energyLoss;
                    double percent5 = groupEnergy * 0.05;
                    groupEnergy += percent5;
                    double drop30 = totalWater * 0.3;
                    totalWater -= drop30;
                } else if (i % 3 == 0) {
                    groupEnergy = groupEnergy - energyLoss;
                    double percent10 = groupEnergy * 0.1;
                    groupEnergy += percent10;
                    double food = totalFood / players;
                    totalFood -= food;
                } else {
                    groupEnergy = groupEnergy - energyLoss;
                }
                energyLoss = Double.parseDouble(scanner.nextLine());
            }

            if (!(groupEnergy >= 0)) {
                System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupEnergy);
            } else {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
                break;
            }
        }
    }
}

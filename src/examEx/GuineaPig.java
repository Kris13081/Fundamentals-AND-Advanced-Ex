package examEx;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double weight =Double.parseDouble(scanner.nextLine());
        boolean end = false;
        double coverPercentage = weight * 0.333;
        for (int i = 1; i <= 10; i++) {
            if (end){
                System.exit(0);
            }
            for (int j = 1; j <= 3; j++) {


                double foodForDay = 0.3;
                if ((int)food <= 0 || (int)hay <= 0.0 || (int)cover <= 0.0) {
                    System.out.println("Merry must go to the pet store!");
                    end = true;
                    break;
                } else {
                    if (j % 3 == 0) {
                        cover -= coverPercentage;
                        food -= foodForDay;
                    } else if (j % 2 == 0) {
                        food -= foodForDay;
                        hay -= food * 0.05 ;
                    } else {
                        food -= foodForDay;
                    }
                }
            }
        }
        if (!end) {
            print(food, hay, cover);
        }
    }

    public static void print(double excessFood, double excessHay, double excessCover) {
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", excessFood, excessHay, excessCover);
    }
}

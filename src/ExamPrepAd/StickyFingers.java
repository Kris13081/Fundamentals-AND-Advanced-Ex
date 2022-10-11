package ExamPrepAd;

import java.util.Scanner;

public class StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] citi = new String[size][size];
        String[] commands = scanner.nextLine().split(",");


        int currentCol = 0;
        int currentRow = 0;

        for (int row = 0; row < size; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int cow = 0; cow < size; cow++) {
                citi[row][cow] = input[cow];

                if (citi[row][cow].equals("D")) {
                    currentCol = cow;
                    currentRow = row;
                }
            }
        }
        int totalMoney = 0;
        boolean caught = false;


        for (String command : commands) {

            switch (command) {
                case "up":
                    if (currentRow - 1 >= 0) {
                        citi[currentRow][currentCol] = "+";
                        currentRow--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "down":
                    if (currentRow + 1 < size) {
                        citi[currentRow][currentCol] = "+";
                        currentRow++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "left":
                    if (currentCol - 1 >= 0) {
                        citi[currentRow][currentCol] = "+";
                        currentCol--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "right":
                    if (currentCol + 1 < size) {
                        citi[currentRow][currentCol] = "+";
                        currentCol++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
            }


            if (citi[currentRow][currentCol].equals("P")) {
                System.out.printf("You got caught with %d$, and you are going to jail.%n", totalMoney);
                citi[currentRow][currentCol] = "#";
                caught = true;
                break;
            }
            if (citi[currentRow][currentCol].equals("$")) {
                System.out.printf("You successfully stole %d$.%n", currentRow * currentCol);
                totalMoney += currentRow * currentCol;
            }
            citi[currentRow][currentCol] = "D";
        }
        if (!caught) {
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalMoney);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(String.join(" ", citi[i]));
        }

    }
}

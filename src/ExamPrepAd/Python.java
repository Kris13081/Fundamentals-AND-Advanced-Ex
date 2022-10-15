package ExamPrepAd;

import java.util.Arrays;
import java.util.Scanner;

public class Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(", ");

        String[][] screen = new String[size][size];

        int playerRow = -1;
        int playerCol = -1;
        int nextRow = playerRow;
        int nextCol = playerCol;

        for (int row = 0; row < size; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                screen[row][col] = input[col];


                if (screen[row][col].equals("s")) {
                    playerRow = row;
                    playerCol = col;
                    nextRow = playerRow;
                    nextCol = playerCol;
                }
            }
        }
        int length = 1;
        boolean wasKilledByEnemy = false;
        for (String command : commands) {

            switch (command) {
                case "up":
                    if (playerRow - 1 >= 0) {
                        nextRow--;
                    } else {
                        nextRow = size - 1;
                    }
                    break;
                case "down":
                    if (playerRow + 1 < size) {
                        nextRow++;
                    } else {
                        nextRow = 0;
                    }
                    break;
                case "left":
                    if (playerCol - 1 >= 0) {
                        nextCol--;
                    } else {
                        nextCol = size - 1;
                    }
                    break;
                case "right":
                    if (playerCol + 1 < size) {
                        nextCol++;
                    } else {
                        nextCol = 0;
                    }
                    break;
            }
            if (screen[nextRow][nextCol].equals("e")) {
                System.out.println("You lose! Killed by an enemy!");
                wasKilledByEnemy = true;
                break;
            }
            if (screen[nextRow][nextCol].equals("f")) {
                screen[playerRow][playerCol] = "*";
                length++;
            }
            screen[playerRow][playerCol] = "*";
            screen[nextRow][nextCol] = "s";
            playerRow = nextRow;
            playerCol = nextCol;

        }
        if (!wasKilledByEnemy) {
            printer(screen, length);
        }
    }

    private static void printer(String[][] screen, int length) {
        int leftFood = 0;

        for (String[] strings : screen) {
            for (String string : strings) {
                if (string.equals("f")) {
                    leftFood++;
                }
            }
        }

        if (leftFood == 0) {
          System.out.printf("You win! Final python length is %d", length);
      } else {
          System.out.printf("You lose! There is still %d food to be eaten.", leftFood);
      }
    }
}

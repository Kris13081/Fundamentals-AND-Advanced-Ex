package ExamPrepAd;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sizes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = sizes[0];
        int cows = sizes[1];

        String[][] map = new String[rows][cows];
        int currentCol = 0;
        int currentRow = 0;

        for (int row = 0; row < map.length; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int cow = 0; cow < map[row].length; cow++) {
                map[row][cow] = input[cow];

                if (map[row][cow].equals("Y")) {
                    currentCol = cow;
                    currentRow = row;
                }
            }
        }
        int oldRow = 0;
        int oldCol = 0;
        List<String> rightPath = new LinkedList<>();
        String command = scanner.nextLine();
        while (!command.equals("Finish")){


            switch (command){
                case "up":
                    if (currentRow - 1 >= 0) {
                        map[currentRow][currentCol] = "-";
                        oldRow = currentRow;
                        oldCol = currentCol;
                        currentRow--;
                    } else {
                        map[currentRow][currentCol] = "Y";
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "down":
                    if (currentRow + 1 < map.length) {
                        map[currentRow][currentCol] = "-";
                        oldRow = currentRow;
                        oldCol = currentCol;
                        currentRow++;
                    } else {
                        map[currentRow][currentCol] = "Y";
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "left":
                    if (currentCol - 1 >= 0) {
                        map[currentRow][currentCol] = "-";
                        oldRow = currentRow;
                        oldCol = currentCol;
                        currentCol--;
                    } else {
                        map[currentRow][currentCol] = "Y";
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "right":
                    if (currentCol + 1 < map.length) {
                        map[currentRow][currentCol] = "-";
                        oldRow = currentRow;
                        oldCol = currentCol;
                        currentCol++;
                    } else {
                        map[currentRow][currentCol] = "Y";
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
            }
            if (map[currentRow][currentCol].equals("T")){
                map[oldRow][oldCol] = "Y";
                currentRow = oldRow;
                currentCol = oldCol;
                command = scanner.nextLine();
               continue;
            }
            if (map[currentRow][currentCol].equals("X")){
                map[currentRow][currentCol] = "X/Y";
                rightPath.add(command);
                command = scanner.nextLine();
                continue;
            }
            map[currentRow][currentCol] = "Y";
            rightPath.add(command);


            command = scanner.nextLine();
        }
        if (map[currentRow][currentCol].equals("X/Y")){
            System.out.println("I've found the treasure!");
            String string = String.join(", ", rightPath);
            System.out.println("The right path is " + string);
        } else {
            System.out.println("The map is fake!");
        }
    }
}

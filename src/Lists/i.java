package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");

            switch (tokens[0]){
                case "Contains":
                    int num = scanner.nextInt();
                    containsNum(numbers, num);
                    break;
            }
            System.out.println();
        }
    }
    public static void containsNum(List<Integer> numbers, int num){
      if (numbers.contains(num)) {
          System.out.println("Yes");
      }else {
          System.out.println("No");
      }
    }
}

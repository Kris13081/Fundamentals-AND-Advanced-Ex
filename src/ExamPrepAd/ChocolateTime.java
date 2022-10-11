package ExamPrepAd;

import java.util.*;
import java.util.stream.Collectors;

public class ChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> chocolatesBars = new TreeMap<>();
        Deque<Double> milk = new ArrayDeque<>();

        List<Double> milkQuantity = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < milkQuantity.size(); i++) {
            milk.offer(milkQuantity.get(i));
        }

        Deque<Double> cacao = new ArrayDeque<>();
        List<Double> cacaoQuantity = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < cacaoQuantity.size(); i++) {
            cacao.push(cacaoQuantity.get(i));
        }


        int milkCounter = 0;
        int darkCounter = 0;
        int bakingCounter = 0;

        while (!cacao.isEmpty() && !milk.isEmpty()) {

            double milkValue = milk.poll();
            double cacaoValue = cacao.pop();

            if (cacaoValue == 0){
                milkValue += 10;
                milk.offer(milkValue);
            }

            double chocolateValue = quantityCalculator(milkValue, cacaoValue);
            if (chocolateValue == 30) {
                chocolatesBars.put("Milk Chocolate", milkCounter + 1);
                milkCounter++;
            } else if (chocolateValue == 50) {
                chocolatesBars.put("Dark Chocolate", darkCounter + 1);
                darkCounter++;
            } else if (chocolateValue == 100) {
                chocolatesBars.put("Baking Chocolate", bakingCounter + 1);
                bakingCounter++;
            } else {
                milkValue += 10;
                milk.offer(milkValue);
            }
        }
        if (chocolatesBars.size() < 3) {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        } else {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }
        for (var entry : chocolatesBars.entrySet()) {
            System.out.printf("# %s --> %d\n", entry.getKey(), entry.getValue());
        }

    }

    public static double quantityCalculator(double milk, double cacao) {
        return (cacao / (cacao + milk)) * 100;
    }
}

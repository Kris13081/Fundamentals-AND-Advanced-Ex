package CarSalesman;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEngines = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new LinkedList<>();

        for (int i = 0; i < numberOfEngines; i++) {
            Engine engine = new Engine();
            engine = engine.enginSpecs(scanner);
            engineList.add(engine);
            System.out.println();
        }
    }
}

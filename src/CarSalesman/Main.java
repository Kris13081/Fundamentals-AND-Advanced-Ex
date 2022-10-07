package CarSalesman;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEngines = Integer.parseInt(scanner.nextLine());
//        List<Engine> engineList = new LinkedList<>();

        for (int i = 0; i < numberOfEngines; i++) {
            Engine engine = new Engine();
            Map<String, Engine> engines = engine.enginSpecs(scanner);
            engines.forEach((s, engine1) -> System.out.print(engine1.toString()));
        }
    }
}

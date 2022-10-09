package CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Main {

    public static void main(String[] args) {


        List<Car> carList = new ArrayList<>();

//        int numbersOfCars= Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engineMap = new Engine().enginProducer();
        engineMap.forEach((s, v) -> System.out.println(v));

    }
}

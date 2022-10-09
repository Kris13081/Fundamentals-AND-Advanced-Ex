package CarSalesman;

import java.util.Map;
import java.util.Scanner;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String colour;
    
    public Car(String model, Engine engine, String weight, String colour) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.colour = colour;
    }
    public Car(){

    }

    public Engine enginGetter(Map<String, Engine> engines){
        boolean enginExists = engines.containsKey(model);
        if (enginExists){
          return engines.get(engine.getModel());
        }
        return null;
    }
    public Car carSpecs(Scanner scanner){
        Car car;
        String[] carData = scanner.nextLine().split(" ");
        String carModel = carData[0];
        if (carData.length -1 < 2){
            car = new Car(carModel, enginGetter(engine.enginProducer()), "n/a", "n/a");
            return car;
        }
//        else if (carData.length - 1 == 3) {


//        }
        return null;
    } 
    public void carProducer(Scanner scanner){

    }
    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

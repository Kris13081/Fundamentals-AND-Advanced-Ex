package DefiningClassesEX.RawData;

public class Cargo {
    private int weight;
    private String name;

    public Cargo(int cargoWeight, String cargoType) {
        this.weight = cargoWeight;
        this.name = cargoType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

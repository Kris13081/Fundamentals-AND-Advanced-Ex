package DefiningClassesEX.RawData;

import java.util.List;

public class Tire {
    private double Tire1Pressure;
    private double Tire2Pressure;
    private double Tire3Pressure;
    private double Tire4Pressure;
    private int Tire1Age;
    private int Tire2Age;
    private int Tire3Age;
    private int Tire4Age;




    public Tire(double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
        Tire1Pressure = tire1Pressure;
        Tire2Pressure = tire2Pressure;
        Tire3Pressure = tire3Pressure;
        Tire4Pressure = tire4Pressure;
        Tire1Age = tire1Age;
        Tire2Age = tire2Age;
        Tire3Age = tire3Age;
        Tire4Age = tire4Age;
    }

    public boolean tireWithLowerThanOnePressure(double tire1Pressure, double tire2Pressure, double tire3Pressure, double tire4Pressure){
        return tire1Pressure < 1 || tire2Pressure < 1 || tire3Pressure < 1 || tire4Pressure < 1;
    }

    public double getTire1Pressure() {
        return Tire1Pressure;
    }

    public void setTire1Pressure(double tire1Pressure) {
        Tire1Pressure = tire1Pressure;
    }

    public double getTire2Pressure() {
        return Tire2Pressure;
    }

    public void setTire2Pressure(double tire2Pressure) {
        Tire2Pressure = tire2Pressure;
    }

    public double getTire3Pressure() {
        return Tire3Pressure;
    }

    public void setTire3Pressure(double tire3Pressure) {
        Tire3Pressure = tire3Pressure;
    }

    public double getTire4Pressure() {
        return Tire4Pressure;
    }

    public void setTire4Pressure(double tire4Pressure) {
        Tire4Pressure = tire4Pressure;
    }

    public int getTire1Age() {
        return Tire1Age;
    }

    public void setTire1Age(int tire1Age) {
        Tire1Age = tire1Age;
    }

    public int getTire2Age() {
        return Tire2Age;
    }

    public void setTire2Age(int tire2Age) {
        Tire2Age = tire2Age;
    }

    public int getTire3Age() {
        return Tire3Age;
    }

    public void setTire3Age(int tire3Age) {
        Tire3Age = tire3Age;
    }

    public int getTire4Age() {
        return Tire4Age;
    }

    public void setTire4Age(int tire4Age) {
        Tire4Age = tire4Age;
    }


}

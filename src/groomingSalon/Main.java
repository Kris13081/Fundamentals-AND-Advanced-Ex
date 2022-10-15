package groomingSalon;

public class Main {

    public static void main(String[] args) {

        Pet kiki = new Pet("Kiki", 8, "Kris");
        Pet pip = new Pet("Pip", 3 ,"Arnold");
        Pet rex = new Pet("Rex", 1 ,"Filip");


        GroomingSalon groomingSalon = new GroomingSalon(5);
        groomingSalon.add(kiki);
        groomingSalon.add(pip);
        groomingSalon.add(rex);


        System.out.println(groomingSalon.getCount());
        System.out.println(groomingSalon.getStatistics());
    }
}

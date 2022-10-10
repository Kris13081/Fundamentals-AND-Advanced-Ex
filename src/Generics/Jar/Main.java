package Generics.Jar;

public class Main {
    public static void main(String[] args) {

        Jar<String> stringJar = new Jar<>();

        stringJar.add("Me");
        stringJar.add("You");


        Jar<Integer> numbers = new Jar<>();
        numbers.add(13);

    }
}

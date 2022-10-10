package Generics.GenericScale;

public class Main {
    public static void main(String[] args) {

        Integer left = 13;
        Integer right = 42;

        Scale<Integer> intScale = new Scale<>(left, right);
        System.out.println(intScale.getHeavier());
    }
}

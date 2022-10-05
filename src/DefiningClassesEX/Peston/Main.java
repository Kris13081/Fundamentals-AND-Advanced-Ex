package DefiningClassesEX.Peston;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Person> people = new TreeMap<>();

        while (n-- > 0) {
            String input = scanner.nextLine();
            String[] personData = input.split(" ");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                people.put(person.getName(), person);
            }
        }

        peoplePrint(people);

    }

    private static void peoplePrint(Map<String,Person> people) {
       people.forEach((s, person) -> System.out.println(s + " - " + person.getAge()));
    }
}





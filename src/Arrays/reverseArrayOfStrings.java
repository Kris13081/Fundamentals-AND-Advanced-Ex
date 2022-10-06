package Arrays;

import java.util.Scanner;

public class reverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String [] elementsAsStrings = inputLine.split("\\s+");


        for (int i = 0; i < elementsAsStrings.length / 2; i++) {
            int otherIndex = elementsAsStrings.length -1 - i;
            String currentElement = elementsAsStrings[i];
            elementsAsStrings[i] = elementsAsStrings[otherIndex];
            elementsAsStrings[otherIndex] = currentElement;
        }
        for (String s : elementsAsStrings) {
            System.out.print(s + " ");
        }
    }
}

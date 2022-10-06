package TextProcessing;


import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder numbers = new StringBuilder();
        StringBuilder characters = new StringBuilder();
        StringBuilder symbol = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) >= 48 && text.charAt(i) <= 57 ){
                char number = text.charAt(i);
                numbers.append(number);
            } else if (text.charAt(i) >= 65 && text.charAt(i) <= 90 || text.charAt(i) >= 97 && text.charAt(i) <= 122){
                char character = text.charAt(i);
                characters.append(character);
            }else if (text.charAt(i) >= 33 && text.charAt(i) <= 47 || text.charAt(i) >= 58 && text.charAt(i) <= 64 || text.charAt(i) >= 91 && text.charAt(i) <= 96 || text.charAt(i) >= 123 && text.charAt(i) <= 126) {
                char sym = text.charAt(i);
                symbol.append(sym);
            }
        }
        System.out.println(numbers);
        System.out.println(characters);
        System.out.println(symbol);
    }
}

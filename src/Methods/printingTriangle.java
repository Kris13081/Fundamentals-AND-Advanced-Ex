package Methods;

import java.util.Scanner;

public class printingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int triangleLength = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= triangleLength; i++) {
            numPrinter(1,i);

        }
        for (int k = triangleLength -1; k >= 1; k--) {
            numPrinter(1,k);
        }
    }

    private static void numPrinter(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

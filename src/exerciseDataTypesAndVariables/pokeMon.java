package exerciseDataTypesAndVariables;

import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int N = Integer.parseInt(scanner.nextLine());
         int M = Integer.parseInt(scanner.nextLine());
         int Y = Integer.parseInt(scanner.nextLine());
         double halfOfN = N * 0.50;
         int targets = 0;

         while (N >= M){
             N -= M;
             targets++;
             if (N == halfOfN && Y != 0){
                 N /= Y;
             }
         }
        System.out.println(N);
        System.out.println(targets);
    }

    public static class train {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int wagons = Integer.parseInt(scanner.nextLine());
            int[] train = new int[wagons];
            int ppl = 0;

            for (int i = 0; i < train.length; i++) {
                int pplInWagons = Integer.parseInt(scanner.nextLine());
                ppl += pplInWagons;
                System.out.print(pplInWagons + " ");
            }
            System.out.println("\n" + ppl);
        }
    }
}

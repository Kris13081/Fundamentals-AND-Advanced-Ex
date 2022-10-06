
import java.util.Scanner;


public class FinalExamEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stopsList = scanner.nextLine();


        String line = scanner.nextLine();

        while (!line.equals("Travel")) {
            String[] command = line.split("[:]");


            switch (command[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(command[1]);
                    String destinationName = command[2];
                    if (index >= 0 && index < stopsList.length()) {
                        StringBuilder sb = new StringBuilder(stopsList);
                        stopsList = sb.insert(index, destinationName).toString();
                    }
                    System.out.println(stopsList);
                    break;

                case "Remove Stop":

                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);


                    if ((startIndex >= 0 && startIndex < stopsList.length()) && (endIndex >= 0 && endIndex < stopsList.length())) {

                        StringBuilder sb = new StringBuilder(stopsList);
                        stopsList = sb.replace(startIndex, endIndex + 1, "").toString();
                    }
                    System.out.println(stopsList);
                    break;

                case "Switch":

                    String oldDestinationName = command[1];
                    String newDestinationName = command[2];
                    if (stopsList.contains(oldDestinationName)) {
                        stopsList = stopsList.replace(oldDestinationName, newDestinationName);

                    }
                    System.out.println(stopsList);
                    break;
            }

            line = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: "+stopsList);
    }
}

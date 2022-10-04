package SetsAndMapsAdvanced;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> studentsAvgGrade = new TreeMap<>();
        double averageGrade = 0.0;

        while (n-- > 0) {
            String[] info = scanner.nextLine().split(" ");

            String studentName = info[0];
            double grade = Double.parseDouble(info[1]);

            studentsAvgGrade.putIfAbsent(studentName, new ArrayList<Double>());

            ArrayList<Double> grades = studentsAvgGrade.get(studentName);
            grades.add(grade);



            }
        }

}

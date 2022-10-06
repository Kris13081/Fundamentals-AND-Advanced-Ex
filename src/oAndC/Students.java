package oAndC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {


    public static class Student {

        String firstName;
        String lastName;
        int age;
        String city;

        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }


        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String line = scanner.nextLine();


        while (!line.equals("end")) {
            String[] tokens = line.split(" ");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            Student student = new Student(firstName, lastName, age, city);

            students.add(student);
            line = scanner.nextLine();

            if (isStudentExsisting(students, firstName, lastName)) {
                Student stud = getStudent(students, firstName, lastName);

                stud.setFirstName(firstName);
                stud.setLastName(lastName);
                stud.setAge(age);
                stud.setCity(city);
            } else {
                Student stud = new Student(firstName, lastName, age, city);
                students.add(stud);
            }
        }
        String filterCity = scanner.nextLine();

        for (Student stud : students) {
            if (stud.getCity().equals(filterCity)) {
                System.out.printf("%s %s is %d years old\n", stud.getFirstName(), stud.getLastName(), stud.getAge());
            }
        }
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student stud : students){
            if (stud.getFirstName().equals(firstName) && stud.lastName.equals(lastName)){
                existingStudent = stud;
            }
        }
        return existingStudent;
    }

    private static boolean isStudentExsisting(List<Student> students, String firstName, String lastName) {
        for (Student stud : students) {
            if (stud.getFirstName().equals(firstName) && stud.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}


package homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student aspirant = new Aspirant();
        Student student = new Student();
        Aspirant aspirant1 = new Aspirant();


        Student[] students = new Student[]{student, aspirant};
        student.getScholarship(5.0, false);
        aspirant.getScholarship(3.0, true);
        aspirant1.getScholarship(5.0, true);


        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        switch (firstName) {
            case "Студент":
                Student.whoAreYou(firstName);
                student.getScholarship(5.0, true);
                break;
            case "Аспирант":
                Student.whoAreYou(firstName);
                aspirant.getScholarship(4.0,true);
                break;
        }
    }
}
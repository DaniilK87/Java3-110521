package honework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student aspirant = new Aspirant();
        Student student = new Student();
        Aspirant aspirant1 =new Aspirant();


        Student[] students = new Student[]{student, aspirant};
        student.getScholarship(5.0,false);
        aspirant.getScholarship(3.0,true);
        aspirant1.getScholarship(5.0,true);


        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        Student student1 = Student.whoAreYou(firstName);
        if (student1.equals(Constants.STUDENT)) {
            student.getScholarship(5.0,true);
        }
        if (student1.equals(Constants.ASPIRANT)) {
            aspirant.getScholarship(3.0,true);
        }
        System.out.println(student1);

    }

    //Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
    //а) Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
    //б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
    //в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
    // Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
    // Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
    //г) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.

}

package honework2;

import java.util.Scanner;

public class Student {


    private String firstName;
    private String lastName;
    private boolean group;
    private double averageMark;

    public static Student whoAreYou(String firstName) {
        if (firstName.equals(Constants.STUDENT)) {
            return new Student();
        }
        if (firstName.equals(Constants.ASPIRANT)) {
            return new Aspirant();
        }
        return null;
    }
    
    public int getScholarship(double averageMark, boolean group){
        if (averageMark == Constants.AVERAGE_MARK && group == Constants.GROUP) {
            System.out.println("Выдать студенту 100 грн");
            return 100;
        } else {
            System.out.println("Выдать студенту 80 грн");
            return 80;
        }
    }


}


    //Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
        //а) Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
        //б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
        //в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
            // Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
            // Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
        //г) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.


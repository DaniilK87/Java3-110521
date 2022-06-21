package homework4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Students {

    private int age;

    private String name;


    @Override
    public String toString() {
        return "Студент{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Students() {
    }

    private List<Students> studentsList(List<Students> list) {
        list.add(new Students(18,"Иван"));
        list.add(new Students(19,"Олег"));
        list.add(new Students(17,"Виктор"));
        list.add(new Students(22,"Дмитрий"));
        list.add(new Students(23,"Вячеслав"));
        return list;
    }

    public void changeAgeStudent() {
        System.out.println(studentsList(new ArrayList<>()));
        ArrayList<Students> students = new ArrayList<>();
        for (Students name: studentsList(students)) {
            String sizeName = String.valueOf(name.name.length());
            if (!sizeName.equals(String.valueOf(Constants.CHAR_SIZE.length()))) {
                int newAge2 = students.get(2).age + Constants.FOUR;
                int newAge3 = students.get(3).age + Constants.FOUR;
                int newAge4 = students.get(4).age + Constants.FOUR;
                students.set(2,new Students(newAge2,students.get(2).name));
                students.set(3,new Students(newAge3,students.get(3).name));
                students.set(4,new Students(newAge4,students.get(4).name));
                System.out.println(students);
                break;
            }
        }
    }


    public void deleteStudent() {
        System.out.println();
        System.out.println(studentsList(new LinkedList<>()));
        LinkedList<Students> students = new LinkedList<>();
        for (Students student: studentsList(students)) {
            if (student.age > Constants.LIMIT_AGE) {
                students.remove(1);
                students.removeLast();
                students.removeLast();
                System.out.println(students);
                break;
            }
        }
    }
}

//1) Создать класс студенты. Добавить штук 5 в ArrayList
//2) у студентов поля age, name
//3) Всем у кого имя больше 4 буква. Увеличить возраст на 4 года

//1) Создать класс студенты. Добавить штук 5 в LinkedList
//2) у студентов поля age, name
//3) Всем у кого имя больше возраст больше 18 -----------> удалить.

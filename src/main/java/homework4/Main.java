package homework4;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<User> user = new TreeSet<>();
             user.add(new User("Ivan", 174,75));
             user.add(new User("Igor", 185,93));
             user.add(new User("Anton", 189,101));
        System.out.println(user);
    }
}

//Создать класс User с полями возраст, имя, рост и вес.
// Забить обьектами этого класса TreeSet.
// Сначала выведи просто в порядке увеличения роста.
// Далее в натуральном порядке по имени, если имена одинаковые то по росту, если и рост одинаковый, то все равно добавить (просто учти этот момент).

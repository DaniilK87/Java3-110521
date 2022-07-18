package homework5;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int height;
    private int weight;

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name == user.name && height == user.height && weight == user.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight);
    }

    public User(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(User user) {
        if (this.height == user.height) {
            System.out.println("в порядке увеличения роста");
            return height - user.height;
        }
        if (this.name.equals(user.name)){
            System.out.println("сортировка по имени");
            return user.name.compareTo(String.valueOf(user));
        }
        return user.name.compareTo(String.valueOf(user));
    }
}

// Создать класс User с полями возраст, имя, рост и вес.
// Забить обьектами этого класса TreeSet.
// Сначала выведи просто в порядке увеличения роста.
// Далее в натуральном порядке по имени,
// если имена одинаковые то по росту, если и рост одинаковый, то все равно добавить (просто учти этот момент).

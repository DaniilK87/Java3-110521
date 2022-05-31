package homework;

import java.util.Random;

public class Warrior {

    int health;

    public Warrior() {}


    public Warrior(int health) {
        this.health = health;
    }


    public int randomDamageOne() {
        Random rnd = new Random();
        int result = rnd.nextInt(2)*20;
        if (result == 20) {System.out.println("Первый юнит атаковал и попал");}
        else if (result == 0) {
            System.out.println("Первый юнит атаковал и промахнулся");
        }
        return result;
    }

    public int randomDamageTwo() {
        Random rnd = new Random();
        int result = rnd.nextInt(2)*20;
        if (result == 20) {System.out.println("Второй юнит атаковал и попал");}
        else if (result == 0) {
            System.out.println("Второй юнит атаковал и промахнулся");
        }
        return result;
    }



}



    //Напишите программу по следующему описанию.
    //Есть класс "Воин". От него создаются два экземпляра-юнита. Каждому устанавливается здоровье в 100 очков.
    //В случайном порядке они бьют друг друга. Тот, кто бьет, здоровья не теряет. У того, кого бьют, оно уменьшается на 20 очков от одного удара.
    //После каждого удара надо выводить сообщение, какой юнит атаковал, и сколько у противника осталось здоровья.
    //Как только у кого-то заканчивается ресурс здоровья, программа завершается сообщением о том, кто одержал победу.


package homework;

import java.util.Random;

public class Warrior {

    int health;
    String unitName;
    int damage;

    public Warrior() {
    }

    public Warrior(int health, String unitName) {
        this.health = health;
        this.unitName = unitName;
    }

    private int randomMove() {
        Random rnd = new Random();
        int result = rnd.nextInt(2);
        return result;
    }

    public int randomDamage() {
        if (randomMove() == 0) {
            damage = 0;
            //System.out.println(health);
        } else {
            damage = 20;
            //System.out.println(health);
        }
        return damage;
    }

    public int zeroDamage() {
        if (randomMove() == 0) {
            damage = 0;
        }
        return damage;
    }

    public int maxDamage() {
        if (randomMove() == 20) {
            damage = 20;
        }
        return damage;
    }




}








    /*public int randomDamageOne() {
        Random rnd = new Random();
        int result = rnd.nextInt(2) * 20;
        if (result == 20) {
            System.out.println("Второй юнит атаковал и попал");
        } else {
            System.out.println("Второй юнит атаковал и промахнулся");
        }
        return result;
    }

    public int randomDamageTwo() {
        Random rnd = new Random();
        int result = rnd.nextInt(2) * 20;
        if (result == 20) {
            System.out.println("Первый юнит атаковал и попал");
        } else {
            System.out.println("Первый юнит атаковал и промахнулся  ");
        }
        return result;
    }*/


    //Напишите программу по следующему описанию.
        //Есть класс "Воин". От него создаются два экземпляра-юнита. Каждому устанавливается здоровье в 100 очков.
        //В случайном порядке они бьют друг друга. Тот, кто бьет, здоровья не теряет. У того, кого бьют, оно уменьшается на 20 очков от одного удара.
        //После каждого удара надо выводить сообщение, какой юнит атаковал, и сколько у противника осталось здоровья.
        //Как только у кого-то заканчивается ресурс здоровья, программа завершается сообщением о том, кто одержал победу.



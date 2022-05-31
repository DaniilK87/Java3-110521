package homework;


public class Main {

    public static void main(String[] args) {

        Warrior unit = new Warrior();
        Warrior unitOne = new Warrior(100);
        Warrior unitTwo = new Warrior(100);
        for (int i = 0; i < 15; i++) {
            unitOne.health = unitTwo.health - unit.randomDamageOne();
            System.out.println("У второго юнита осталось здоровья:" + " " + unitOne.health);
            if (unitOne.health == 0) {
                System.out.println("Игра окончена, победил первый юнит");
                break;
            }
            unitTwo.health = unitOne.health - unit.randomDamageTwo();
            System.out.println("У первого юнита осталось здоровья:" + " " + unitTwo.health);
            if (unitTwo.health == 0) {
                System.out.println("Игра окончена, победил второй юнит");
                break;
            }
        }
    }




        //Напишите программу по следующему описанию.
                //Есть класс "Воин". От него создаются два экземпляра-юнита. Каждому устанавливается здоровье в 100 очков.
                //В случайном порядке они бьют друг друга. Тот, кто бьет, здоровья не теряет. У того, кого бьют, оно уменьшается на 20 очков от одного удара.
                //После каждого удара надо выводить сообщение, какой юнит атаковал, и сколько у противника осталось здоровья.
                //Как только у кого-то заканчивается ресурс здоровья, программа завершается сообщением о том, кто одержал победу.
}

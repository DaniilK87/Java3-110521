package homework;

public class Warrior {

    int health;
    int damage;



    public Warrior(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }


    public void strikeOne(int health) {
        for (int i = 0; i < 100; i++) {
          int resultOne = health - randomStrike();
          int resultTwo = resultOne - randomStrike();

            System.out.println(resultOne);
            System.out.println(resultTwo);
          if (resultOne == 0) {
              System.out.println("Победа 1");
          } else if (resultTwo == 0) {
              System.out.println("Победа 1");
          }
        }
    }


    public static int randomStrike() {
        return (int) (Math.random()*2)*20;
    }


        //Напишите программу по следующему описанию.
        //Есть класс "Воин". От него создаются два экземпляра-юнита. Каждому устанавливается здоровье в 100 очков.
        //В случайном порядке они бьют друг друга. Тот, кто бьет, здоровья не теряет. У того, кого бьют, оно уменьшается на 20 очков от одного удара.
        //После каждого удара надо выводить сообщение, какой юнит атаковал, и сколько у противника осталось здоровья.
        //Как только у кого-то заканчивается ресурс здоровья, программа завершается сообщением о том, кто одержал победу.
}


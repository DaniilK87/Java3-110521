package lesson1;

import java.util.Scanner;

public class Apple extends Fruit  {


    @Override
    float getWeight() {
        return 1f;
    }

    @Override
    int getSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sum apple");
        int sumApple = scanner.nextInt();
        return sumApple;
    }
}

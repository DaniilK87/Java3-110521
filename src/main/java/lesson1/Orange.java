package lesson1;

import java.util.Scanner;

public class Orange extends Fruit  {


    @Override
    float getWeight() {
        return 1.5f;
    }

    @Override
    int getSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sum orange");
        int sumOrange = scanner.nextInt();
        return sumOrange;
    }
}

package lesson1;


import java.util.ArrayList;

public class Box<A extends Fruit>  {
    ArrayList<Float> appleBox = new ArrayList<>();
    ArrayList<Float> orangeBox = new ArrayList<>();

    public void appleBox() {
        Apple apple = new Apple();
        appleBox.add(apple.getWeight()*apple.getSum());
        System.out.println(appleBox);
    }

    public void orangeBox() {
        Orange orange = new Orange();
        orangeBox.add(orange.getWeight()*orange.getSum());
        System.out.println(orangeBox);
    }


    public static void main(String[] args) {

    }

}

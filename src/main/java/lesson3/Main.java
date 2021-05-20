package lesson3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Data data = new Data();
        data.getData();
        System.out.println("Файл создан");
        data.writeData();
        data.readData();
        data.writeFile();
        data.readFile();
    }
}

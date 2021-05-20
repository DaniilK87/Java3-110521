package lesson3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Data {
    public String text = "Vasya";
    public int data = 7;
    byte [] buf = new byte[25];

    public void getData() throws IOException {
        File file = new File("src/main/java/lesson3/text.txt");
        file.createNewFile();
    }

    public void writeData() throws IOException {
        FileOutputStream fos = new FileOutputStream("text.txt");
        fos.write(text.getBytes(StandardCharsets.UTF_8));
        fos.close();
    }

    public void readData() throws IOException {
        FileInputStream fis = new FileInputStream("text.txt");
        int count;
        while ((count = fis.read(buf)) > 0){
            for (int i = 0; i < count; i++) {
                System.out.print((char)buf[i]);
            }
        }
    }

    public void writeFile() throws IOException {
        String text1 = "Vasya Run";
        int run = 20;
        DataOutputStream out = new DataOutputStream(new FileOutputStream("text.txt"));
        out.writeChars(text1);
        out.write(run);
    }

    public void readFile() throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("text.txt"));
        System.out.print(in.readChar());
        System.out.println(in.readInt());

    }




}

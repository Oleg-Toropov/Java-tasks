package Task_20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        long strInt;
        long out;
        String str;

        FileReader file = new FileReader("task-20-input.txt"); // Считывание данных из файла
        Scanner sc = new Scanner(file);
        str = sc.nextLine();

        strInt = Integer.valueOf(str);

        out = (long) Math.pow(strInt, 2);
        FileWriter fileOut = new FileWriter("task-20-output.txt");
        fileOut.write(String.valueOf(out));
        fileOut.close();
    }
}

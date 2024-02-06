package Task_55;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        int a, b;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (a != b) {  // Используется алгоритм Евклида
            if (a > b) a = a - b;
            else b = b - a;

            try (FileWriter writer = new FileWriter("output.txt")) {
                writer.write(String.valueOf(a));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

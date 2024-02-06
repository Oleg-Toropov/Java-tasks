package Task_85;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NOK {
    public static void main(String[] args) {
        int a, b, c, d, nok;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        c = a;
        d = b;

        while (a != b) { // Используется алгоритм Евклида
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        nok = c / a * d;

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(nok));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

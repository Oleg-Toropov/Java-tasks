package Task_68;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int input;
        int a = 0;
        int b = 1;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            input = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (input - 1 > 0) {
            int c = b + a;
            a = b;
            b = c;
            input--;
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(b));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

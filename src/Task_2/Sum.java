package Task_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("task-2-input.txt"));
             FileWriter writer = new FileWriter("task-2-output.txt")
        ) {
            int result = 0;
            while (scanner.hasNextInt()) {
                result += scanner.nextInt();
            }
            System.out.println(result);
            String st = String.valueOf(result);
            writer.write(st);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

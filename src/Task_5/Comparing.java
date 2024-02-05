package Task_5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Comparing {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("task-5-input.txt"));
             FileWriter writer = new FileWriter("task-5-output.txt")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String result = (a < b) ? "<" : (a > b) ? ">" : "=";
            writer.write(result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

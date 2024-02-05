package Task_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Beads {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("task-3-input.txt"));
             FileWriter writer = new FileWriter("task-3-output.txt")
        ) {
            int count = scanner.nextInt();
            String result = String.valueOf(count + 1);
            writer.write(result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

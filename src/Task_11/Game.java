package Task_11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int a, c;
        int b = 9;
        String result;

        try (FileReader reader = new FileReader("task-11-input.txt")) {
            Scanner scanner = new Scanner(reader);
            a = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        c = b - a;
        result = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);

        try (FileWriter writer = new FileWriter("task-11-output.txt")){
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

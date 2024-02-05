package Task_15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        int input;
        String countCuts;

        try (FileReader reader = new FileReader("task-15-input.txt")) {
            Scanner scanner = new Scanner(reader);
            input = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        countCuts = (input % 2 == 0 && input > 1) ? String.valueOf(input / 2)
                : (input % 2 == 1 && input > 1) ? String.valueOf(input) : "0";

        try (FileWriter writer = new FileWriter("task-15-output.txt")) {
            writer.write(countCuts);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

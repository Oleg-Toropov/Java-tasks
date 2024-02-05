package Task_41;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FortuneTelling {
    public static void main(String[] args) {
        int input;
        int result = 0;

        try (FileReader reader = new FileReader("task-41-input.txt")) {
            Scanner scanner = new Scanner(reader);
            input = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                result += i;
            }
        }

        try (FileWriter writer = new FileWriter("task-41-output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

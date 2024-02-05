package Task_18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BinNumbers {
    public static void main(String[] args) {
        int input;
        String output = "YES";
        try (FileReader reader = new FileReader("task-18-input.txt")) {
            Scanner scanner = new Scanner(reader);
            input = scanner.nextInt();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (input <= 0) {
            output = "NO";
        } else {
            while (input > 1)
                if (input % 2 == 0) {
                    input = input / 2;
                } else {
                    output = "NO";
                    break;
                }
        }

        try (FileWriter writer = new FileWriter("task-18-output.txt")){
            writer.write(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


package Task_62;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        int result = 0;
        int number;
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            number = scanner.nextInt();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (number > 0) {
            if (number % 2 == 1) {
                result++;
                number = number / 2;
            } else {
                number = number / 2;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

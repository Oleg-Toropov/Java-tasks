package Task_66;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Roundels {
    public static void main(String[] args) {
        String input;
        int result = 0;
        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            input = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] ch = input.toCharArray();

        for (char c : ch) {
            if (c == '0' || c == '6' || c == '9') {
                result = result + 1;
            } else if (c == '8') {
                result = result + 2;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")){
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

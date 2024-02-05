package Task_63;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zeros {
    public static void main(String[] args) {
        String input;
        int count = 0;
        int maxCount = 0;

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            input = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') {
                count++;
            } else if (maxCount <= count) {
                maxCount = count;
                count = 0;
            } else if (count != 0) {
                count = 0;
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(String.valueOf(maxCount));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

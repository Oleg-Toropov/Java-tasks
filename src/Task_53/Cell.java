package Task_53;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cell {
    public static void main(String[] args) {
        String input;
        String result = "WHITE";

        try (Scanner scanner = new Scanner(new FileReader("input.txt"))) {
            input = scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        char[] ch = input.toCharArray();

        if (ch[0] == 'A' || ch[0] == 'C' || ch[0] == 'E' || ch[0] == 'G') {
            if (Integer.valueOf(ch[1]) % 2 != 0) {
                result = "BLACK";
            }
        } else if (ch[0] == 'B' || ch[0] == 'D' || ch[0] == 'F' || ch[0] == 'H') {
            if (Integer.valueOf(ch[1]) % 2 == 0) {
                result = "BLACK";
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
